package yq0;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f139684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f139685c;

    public /* synthetic */ c0(int i13, Object obj, Object obj2) {
        this.f139683a = i13;
        this.f139684b = obj;
        this.f139685c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f139683a;
        Object obj = this.f139685c;
        Object obj2 = this.f139684b;
        switch (i13) {
            case 0:
                d0 this$0 = (d0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((ar0.a) obj2).S2(this$0.k(), (ar0.b) this$0.f139687u);
                break;
            case 1:
                com.pinterest.feature.pincarouselads.view.l this$02 = (com.pinterest.feature.pincarouselads.view.l) obj2;
                Context context = (Context) obj;
                int i14 = com.pinterest.feature.pincarouselads.view.l.f47386x;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(context, "$context");
                l21.g gVar = this$02.f47394h;
                if (gVar != null) {
                    gVar.y1(context);
                    break;
                }
                break;
            default:
                com.google.firebase.messaging.q this$03 = (com.google.firebase.messaging.q) obj2;
                Function0 makeClickEvent = (Function0) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(makeClickEvent, "$makeClickEvent");
                this$03.s((gm1.c) makeClickEvent.invoke());
                break;
        }
    }
}
