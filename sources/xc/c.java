package xc;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import wc.f;
import wc.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f134541a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f134542b;

    /* renamed from: c, reason: collision with root package name */
    public b f134543c;

    /* renamed from: d, reason: collision with root package name */
    public b f134544d;

    /* renamed from: e, reason: collision with root package name */
    public int f134545e;

    public c(int i13) {
        h weigher = h.f129087i;
        Intrinsics.checkNotNullParameter(weigher, "weigher");
        this.f134541a = i13;
        this.f134542b = new LinkedHashMap(0, 0.75f);
    }

    public final void a(b bVar) {
        b bVar2 = bVar.f134540d;
        if (bVar2 == null) {
            return;
        }
        bVar2.f134539c = bVar.f134539c;
        b bVar3 = bVar.f134539c;
        if (bVar3 == null) {
            this.f134544d = bVar2;
        } else {
            bVar3.f134540d = bVar2;
        }
        b bVar4 = this.f134543c;
        bVar.f134539c = bVar4;
        bVar.f134540d = null;
        if (bVar4 != null) {
            bVar4.f134540d = bVar;
        }
        this.f134543c = bVar;
    }

    public final void b(String str) {
        b bVar = (b) this.f134542b.remove(str);
        if (bVar != null) {
            d(bVar);
        }
    }

    public final void c(String key, f fVar) {
        LinkedHashMap linkedHashMap = this.f134542b;
        b bVar = (b) linkedHashMap.get(key);
        if (bVar == null) {
            b bVar2 = this.f134543c;
            b bVar3 = new b();
            bVar3.f134537a = key;
            bVar3.f134538b = fVar;
            bVar3.f134539c = bVar2;
            bVar3.f134540d = null;
            this.f134543c = bVar3;
            if (bVar2 == null) {
                this.f134544d = bVar3;
            } else {
                bVar2.f134540d = bVar3;
            }
            int i13 = this.f134545e;
            Intrinsics.checkNotNullParameter(key, "key");
            this.f134545e = Integer.valueOf(l0.J(key).length + fVar.f129083d).intValue() + i13;
            linkedHashMap.put(key, bVar3);
        } else {
            bVar.f134538b = fVar;
            a(bVar);
        }
        b bVar4 = this.f134544d;
        while (bVar4 != null && this.f134545e > this.f134541a) {
            dl2.b.u(linkedHashMap).remove(bVar4.f134537a);
            d(bVar4);
            bVar4 = this.f134544d;
        }
    }

    public final void d(b bVar) {
        b bVar2 = bVar.f134540d;
        if (bVar2 == null) {
            this.f134543c = bVar.f134539c;
        } else {
            bVar2.f134539c = bVar.f134539c;
        }
        b bVar3 = bVar.f134539c;
        if (bVar3 == null) {
            this.f134544d = bVar2;
        } else {
            bVar3.f134540d = bVar2;
        }
        int i13 = this.f134545e;
        Object obj = bVar.f134537a;
        Intrinsics.f(obj);
        String key = (String) obj;
        f fVar = (f) bVar.f134538b;
        Intrinsics.checkNotNullParameter(key, "key");
        this.f134545e = i13 - Integer.valueOf(l0.J(key).length + (fVar != null ? fVar.f129083d : 0)).intValue();
        bVar.f134537a = null;
        bVar.f134538b = null;
        bVar.f134539c = null;
        bVar.f134540d = null;
    }
}
