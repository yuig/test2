package uj0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import java.util.concurrent.Callable;
import k11.h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lr.p;
import so.oa;
import x02.y;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wy0 f122320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f122321c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f122322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f122323e;

    public /* synthetic */ a(Object obj, wy0 wy0Var, boolean z13, String str, int i13) {
        this.f122319a = i13;
        this.f122323e = obj;
        this.f122320b = wy0Var;
        this.f122321c = z13;
        this.f122322d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Unit prefetchBoardPickerSuggestions$lambda$58;
        int i13 = this.f122319a;
        boolean z13 = this.f122321c;
        wy0 me3 = this.f122320b;
        Object obj = this.f122322d;
        Object obj2 = this.f122323e;
        switch (i13) {
            case 0:
                so1.b baseApplicationComponent = (so1.b) obj2;
                String pinId = (String) obj;
                Intrinsics.checkNotNullParameter(baseApplicationComponent, "$baseApplicationComponent");
                Intrinsics.checkNotNullParameter(me3, "$me");
                Intrinsics.checkNotNullParameter(pinId, "$pinId");
                y yVar = (y) ((oa) baseApplicationComponent).f113660e4.get();
                String uid = me3.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                m22.a.a(yVar, uid);
                if (z13) {
                    m22.a.c(yVar, pinId);
                } else {
                    m22.a.b(yVar, pinId);
                }
                return Unit.f80348a;
            case 1:
                prefetchBoardPickerSuggestions$lambda$58 = PinCloseupPresenter.prefetchBoardPickerSuggestions$lambda$58((PinCloseupPresenter) obj2, me3, z13, (String) obj);
                return prefetchBoardPickerSuggestions$lambda$58;
            default:
                h this$0 = (h) obj2;
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(me3, "$creator");
                Intrinsics.checkNotNullParameter(pin, "$pin");
                if (z13) {
                    this$0.f78140a.c(new p(pin, me3));
                }
                return Boolean.valueOf(z13);
        }
    }

    public /* synthetic */ a(boolean z13, h hVar, wy0 wy0Var, f30 f30Var) {
        this.f122319a = 2;
        this.f122321c = z13;
        this.f122323e = hVar;
        this.f122320b = wy0Var;
        this.f122322d = f30Var;
    }
}
