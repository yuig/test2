package tb;

import ja.d0;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f116950a;

    /* renamed from: b, reason: collision with root package name */
    public final b f116951b;

    /* renamed from: c, reason: collision with root package name */
    public final h f116952c;

    public a0(d0 d0Var) {
        this.f116950a = d0Var;
        this.f116951b = new b(this, d0Var, 6);
        this.f116952c = new h(this, d0Var, 2);
    }

    public final void a(String id3, Set tags) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            z zVar = new z((String) it.next(), id3);
            d0 d0Var = this.f116950a;
            d0Var.b();
            d0Var.c();
            try {
                this.f116951b.n(zVar);
                d0Var.r();
            } finally {
                d0Var.m();
            }
        }
    }
}
