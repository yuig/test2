package vl2;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class y implements g {

    /* renamed from: a */
    public final Member f126192a;

    /* renamed from: b */
    public final Type f126193b;

    /* renamed from: c */
    public final Class f126194c;

    /* renamed from: d */
    public final List f126195d;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r1 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y(java.lang.reflect.Member r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f126192a = r1
            r0.f126193b = r2
            r0.f126194c = r3
            if (r3 == 0) goto L27
            b20.c r1 = new b20.c
            r2 = 2
            r1.<init>(r2)
            r1.b(r3)
            r1.c(r4)
            int r2 = r1.C()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.D(r2)
            java.util.List r1 = kotlin.collections.f0.j(r1)
            if (r1 != 0) goto L2b
        L27:
            java.util.List r1 = kotlin.collections.c0.b0(r4)
        L2b:
            r0.f126195d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.y.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }

    @Override // vl2.g
    public final List a() {
        return this.f126195d;
    }

    @Override // vl2.g
    public final Member b() {
        return this.f126192a;
    }

    public void c(Object[] objArr) {
        dl2.b.F(this, objArr);
    }

    public final void d(Object obj) {
        if (obj == null || !this.f126192a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // vl2.g
    public final Type getReturnType() {
        return this.f126193b;
    }
}
