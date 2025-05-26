package ua;

import androidx.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class s extends r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f121348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f121349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f121350c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f121351d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f121352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f121353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u f121354g;

    public s(u uVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f121354g = uVar;
        this.f121348a = obj;
        this.f121349b = arrayList;
        this.f121352e = obj2;
        this.f121353f = arrayList2;
    }

    @Override // ua.r0, ua.o0
    public final void e(Transition transition) {
        u uVar = this.f121354g;
        Object obj = this.f121348a;
        if (obj != null) {
            uVar.u(obj, this.f121349b, null);
        }
        Object obj2 = this.f121350c;
        if (obj2 != null) {
            uVar.u(obj2, this.f121351d, null);
        }
        Object obj3 = this.f121352e;
        if (obj3 != null) {
            uVar.u(obj3, this.f121353f, null);
        }
    }

    @Override // ua.o0
    public final void f(Transition transition) {
        transition.I(this);
    }
}
