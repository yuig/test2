package ads_mobile_sdk;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class tm2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f11603a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11604b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f11605c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vm2 f11606d;

    public tm2(vm2 vm2Var) {
        this.f11606d = vm2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i13 = this.f11603a + 1;
        vm2 vm2Var = this.f11606d;
        if (i13 < vm2Var.f12568b) {
            return true;
        }
        if (!vm2Var.f12569c.isEmpty()) {
            if (this.f11605c == null) {
                this.f11605c = this.f11606d.f12569c.entrySet().iterator();
            }
            if (this.f11605c.hasNext()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f11604b = true;
        int i13 = this.f11603a + 1;
        this.f11603a = i13;
        vm2 vm2Var = this.f11606d;
        if (i13 < vm2Var.f12568b) {
            return (sm2) vm2Var.f12567a[i13];
        }
        if (this.f11605c == null) {
            this.f11605c = vm2Var.f12569c.entrySet().iterator();
        }
        return (Map.Entry) this.f11605c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f11604b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f11604b = false;
        this.f11606d.a();
        int i13 = this.f11603a;
        vm2 vm2Var = this.f11606d;
        if (i13 < vm2Var.f12568b) {
            this.f11603a = i13 - 1;
            vm2Var.b(i13);
        } else {
            if (this.f11605c == null) {
                this.f11605c = vm2Var.f12569c.entrySet().iterator();
            }
            this.f11605c.remove();
        }
    }
}
