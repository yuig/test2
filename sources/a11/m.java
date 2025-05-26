package a11;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.my0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements yb0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ my0 f318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f30 f319c;

    public m(n nVar, my0 my0Var, f30 f30Var) {
        this.f317a = nVar;
        this.f318b = my0Var;
        this.f319c = f30Var;
    }

    @Override // yb0.h
    public final void G6() {
    }

    @Override // yb0.h
    public final void H0(boolean z13) {
    }

    @Override // yb0.h
    public final void t2() {
        String str = this.f318b.f40259b;
        Intrinsics.checkNotNullExpressionValue(str, "getUrl(...)");
        HashMap hashMap = new HashMap();
        this.f317a.h(ml1.b.DEFAULT_TRANSITION.getValue(), -1, this.f319c, null, null, null, str, null, hashMap, false, false, true, false, false, false, false, false);
    }
}
