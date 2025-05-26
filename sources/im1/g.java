package im1;

import android.view.View;
import com.google.firebase.messaging.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f72644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f72645c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f72646d;

    public /* synthetic */ g(Function1 function1, q qVar, Function1 function12, int i13) {
        this.f72643a = i13;
        this.f72644b = function1;
        this.f72645c = qVar;
        this.f72646d = function12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f72643a;
        Function1 makeClickEvent = this.f72646d;
        q this$0 = this.f72645c;
        Function1 doOnClick = this.f72644b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(doOnClick, "$doOnClick");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(makeClickEvent, "$makeClickEvent");
                Unit unit = Unit.f80348a;
                doOnClick.invoke(unit);
                this$0.s((gm1.c) makeClickEvent.invoke(unit));
                break;
            default:
                Intrinsics.checkNotNullParameter(doOnClick, "$doOnClick");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(makeClickEvent, "$makeClickEvent");
                Unit unit2 = Unit.f80348a;
                doOnClick.invoke(unit2);
                this$0.s((gm1.c) makeClickEvent.invoke(unit2));
                break;
        }
    }
}
