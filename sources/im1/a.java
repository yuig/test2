package im1;

import android.view.View;
import com.google.firebase.messaging.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f72623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f72624c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f72625d;

    public /* synthetic */ a(Function1 function1, q qVar, Function1 function12, int i13) {
        this.f72622a = i13;
        this.f72623b = function1;
        this.f72624c = qVar;
        this.f72625d = function12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f72622a;
        Function1 makeClickEvent = this.f72625d;
        q this$0 = this.f72624c;
        Function1 doOnClick = this.f72623b;
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
                Intrinsics.checkNotNullParameter(doOnClick, "$doOnDropdownClick");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(makeClickEvent, "$makeDropdownClickEvent");
                Unit unit2 = Unit.f80348a;
                doOnClick.invoke(unit2);
                this$0.s((gm1.c) makeClickEvent.invoke(unit2));
                break;
        }
    }
}
