package qm2;

import ja.c0;
import java.util.Map;
import qz.w;
import rm2.t;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final c f104424a = new c(f.NULLABLE, false);

    /* renamed from: b, reason: collision with root package name */
    public static final c f104425b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f104426c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f104427d;

    static {
        f fVar = f.NOT_NULL;
        f104425b = new c(fVar, false);
        f104426c = new c(fVar, true);
        t tVar = t.f108791e;
        String i13 = t.i("Object");
        String h10 = t.h("Predicate");
        String h13 = t.h("Function");
        String h14 = t.h("Consumer");
        String h15 = t.h("BiFunction");
        String h16 = t.h("BiConsumer");
        String h17 = t.h("UnaryOperator");
        String j13 = t.j("stream/Stream");
        String j14 = t.j("Optional");
        c0 c0Var = new c0(8);
        new qq2.c(c0Var, t.j("Iterator")).g("forEachRemaining", new w(h14, 4));
        int i14 = 20;
        new qq2.c(c0Var, t.i("Iterable")).g("spliterator", new e82.l(tVar, i14));
        qq2.c cVar = new qq2.c(c0Var, t.j("Collection"));
        cVar.g("removeIf", new w(h10, 10));
        cVar.g("stream", new w(j13, 11));
        cVar.g("parallelStream", new w(j13, 12));
        new qq2.c(c0Var, t.j("List")).g("replaceAll", new w(h17, 13));
        qq2.c cVar2 = new qq2.c(c0Var, t.j("Map"));
        cVar2.g("forEach", new w(h16, 14));
        cVar2.g("putIfAbsent", new w(i13, 15));
        cVar2.g("replace", new w(i13, 16));
        cVar2.g("replace", new w(i13, 17));
        cVar2.g("replaceAll", new w(h15, 18));
        cVar2.g("compute", new h(i13, h15, 0));
        cVar2.g("computeIfAbsent", new h(i13, h13, 1));
        cVar2.g("computeIfPresent", new h(i13, h15, 2));
        cVar2.g("merge", new h(i13, h15, 3));
        qq2.c cVar3 = new qq2.c(c0Var, j14);
        cVar3.g("empty", new w(j14, 19));
        cVar3.g("of", new h(i13, j14, 4));
        cVar3.g("ofNullable", new h(i13, j14, 5));
        cVar3.g("get", new w(i13, i14));
        cVar3.g("ifPresent", new w(h14, 21));
        new qq2.c(c0Var, t.i("ref/Reference")).g("get", new w(i13, 22));
        new qq2.c(c0Var, h10).g("test", new w(i13, 23));
        new qq2.c(c0Var, t.h("BiPredicate")).g("test", new w(i13, 24));
        new qq2.c(c0Var, h14).g("accept", new w(i13, 5));
        new qq2.c(c0Var, h16).g("accept", new w(i13, 6));
        new qq2.c(c0Var, h13).g("apply", new w(i13, 7));
        new qq2.c(c0Var, h15).g("apply", new w(i13, 8));
        new qq2.c(c0Var, t.h("Supplier")).g("get", new w(i13, 9));
        f104427d = c0Var.f75176a;
    }
}
