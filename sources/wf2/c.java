package wf2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f129713a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f129714b;

    /* renamed from: c, reason: collision with root package name */
    public int f129715c;

    public c(Function0 limitProvider) {
        Intrinsics.checkNotNullParameter(limitProvider, "limitProvider");
        this.f129713a = limitProvider;
        this.f129714b = new Object();
    }

    @Override // wf2.a
    public final void a() {
        synchronized (this.f129714b) {
            this.f129715c = 0;
            Unit unit = Unit.f80348a;
        }
    }

    @Override // wf2.a
    public final boolean b() {
        synchronized (this.f129714b) {
            if (this.f129715c >= ((Number) this.f129713a.invoke()).intValue()) {
                return false;
            }
            this.f129715c++;
            return true;
        }
    }
}
