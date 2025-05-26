package pq2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public Call.Factory f101001a;

    /* renamed from: b, reason: collision with root package name */
    public HttpUrl f101002b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f101003c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f101004d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Executor f101005e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f101006f;

    public c1() {
    }

    public final void a(j jVar) {
        Objects.requireNonNull(jVar, "factory == null");
        this.f101004d.add(jVar);
    }

    public final void b(o oVar) {
        Objects.requireNonNull(oVar, "factory == null");
        this.f101003c.add(oVar);
    }

    public final void c(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        HttpUrl.f95629k.getClass();
        HttpUrl d2 = HttpUrl.Companion.d(str);
        if ("".equals(d2.f95636f.get(r0.size() - 1))) {
            this.f101002b = d2;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + d2);
        }
    }

    public final d1 d() {
        if (this.f101002b == null) {
            throw new IllegalStateException("Base URL required.");
        }
        Call.Factory factory = this.f101001a;
        if (factory == null) {
            factory = new OkHttpClient();
        }
        Call.Factory factory2 = factory;
        Executor executor = this.f101005e;
        if (executor == null) {
            executor = t0.f101084a;
        }
        Executor executor2 = executor;
        ln2.k kVar = t0.f101086c;
        ArrayList arrayList = new ArrayList(this.f101004d);
        List g13 = kVar.g(executor2);
        arrayList.addAll(g13);
        List h10 = kVar.h();
        int size = h10.size();
        ArrayList arrayList2 = this.f101003c;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
        arrayList3.add(new g(0));
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(h10);
        return new d1(factory2, this.f101002b, Collections.unmodifiableList(arrayList3), size, Collections.unmodifiableList(arrayList), g13.size(), executor2, this.f101006f);
    }

    public c1(d1 d1Var) {
        this.f101001a = d1Var.f101010b;
        this.f101002b = d1Var.f101011c;
        List list = d1Var.f101012d;
        int size = list.size() - d1Var.f101013e;
        for (int i13 = 1; i13 < size; i13++) {
            this.f101003c.add((o) list.get(i13));
        }
        List list2 = d1Var.f101014f;
        int size2 = list2.size() - d1Var.f101015g;
        for (int i14 = 0; i14 < size2; i14++) {
            this.f101004d.add((j) list2.get(i14));
        }
        this.f101005e = d1Var.f101016h;
        this.f101006f = d1Var.f101017i;
    }
}
