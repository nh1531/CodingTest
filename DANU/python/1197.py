import sys

def kruskal(V, E, edges):
    edges.sort(key=lambda x: x[2])
    parent = [i for i in range(V + 1)]

    def get_parent(x):
        if parent[x] == x:
            return x
        parent[x] = get_parent(parent[x])
        return parent[x]

    def union_parent(a, b):
        a = get_parent(a)
        b = get_parent(b)
        if a < b:
            parent[b] = a
        else:
            parent[a] = b

    def same_parent(a, b):
        return get_parent(a) == get_parent(b)

    answer = 0
    for a, b, cost in edges:
        if not same_parent(a, b):
            union_parent(a, b)
            answer += cost
    return answer

if __name__ == "__main__":
    V, E = map(int, input().split())
    edges = []
    for _ in range(E):
        A, B, C = map(int, input().split())
        edges.append((A, B, C))
    
    result = kruskal(V, E, edges)
    print(result)
