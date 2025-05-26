package jg1;

import java.util.LinkedList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f75955a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public g f75956b;

    @Override // jg1.g
    public final void a() {
        this.f75955a.clear();
        g gVar = this.f75956b;
        if (gVar != null) {
            gVar.a();
        }
    }

    @Override // jg1.g
    public final boolean b() {
        g gVar;
        return this.f75955a.isEmpty() && ((gVar = this.f75956b) == null || gVar.b());
    }

    @Override // jg1.g
    public final boolean c() {
        g gVar = this.f75956b;
        boolean c13 = gVar != null ? gVar.c() : false;
        g gVar2 = this.f75956b;
        if (gVar2 == null || gVar2.b()) {
            LinkedList linkedList = this.f75955a;
            if (!linkedList.isEmpty()) {
                ((Function0) linkedList.removeFirst()).invoke();
            }
        }
        return c13;
    }

    @Override // jg1.g
    public final void cancel() {
        g gVar = this.f75956b;
        if (gVar != null) {
            gVar.cancel();
        }
    }

    @Override // jg1.g
    public final void f() {
        if (this.f75956b == null) {
            LinkedList linkedList = this.f75955a;
            if (linkedList.isEmpty()) {
                return;
            }
            ((Function0) linkedList.removeFirst()).invoke();
        }
    }

    public final String toString() {
        return "current [" + this.f75956b + "] remaining factories [" + this.f75955a.size() + "]";
    }
}
