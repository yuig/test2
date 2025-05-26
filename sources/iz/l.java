package iz;

import android.widget.TextView;
import com.pinterest.api.model.gs0;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import com.pinterest.gestalt.text.GestaltText;
import h32.u0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f73857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gs0 f73858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hz.d f73859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TextView f73860e;

    public /* synthetic */ l(hz.d dVar, int i13, gs0 gs0Var, TextView textView, int i14) {
        this.f73856a = i14;
        this.f73859d = dVar;
        this.f73857b = i13;
        this.f73858c = gs0Var;
        this.f73860e = textView;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f73856a;
        int i14 = this.f73857b;
        gs0 answer = this.f73858c;
        TextView textView = this.f73860e;
        hz.d dVar = this.f73859d;
        Integer num = null;
        switch (i13) {
            case 0:
                m this$0 = (m) dVar;
                GestaltButtonToggle this_apply = (GestaltButtonToggle) textView;
                int i15 = m.F0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(answer, "$answer");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "it");
                u0 u0Var = (u0) CollectionsKt.U(i14, this$0.f73861v0);
                if (u0Var != null) {
                    this$0.h8(u0Var);
                }
                Integer num2 = answer.f38133f;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    List list = this$0.B0;
                    if (list == null) {
                        Intrinsics.r("answerOptions");
                        throw null;
                    }
                    int indexOf = list.indexOf(this_apply);
                    Integer num3 = this$0.f73862w0;
                    a aVar = a.f73821p;
                    if (num3 != null && indexOf == num3.intValue()) {
                        this_apply.s(aVar);
                        this$0.f73862w0 = null;
                    } else {
                        Integer num4 = this$0.f73862w0;
                        if (num4 != null) {
                            int intValue2 = num4.intValue();
                            List list2 = this$0.B0;
                            if (list2 == null) {
                                Intrinsics.r("answerOptions");
                                throw null;
                            }
                            GestaltButtonToggle gestaltButtonToggle = (GestaltButtonToggle) CollectionsKt.U(intValue2, list2);
                            if (gestaltButtonToggle != null) {
                                gestaltButtonToggle.s(aVar);
                            }
                        }
                        this_apply.s(a.f73820o);
                        num = Integer.valueOf(intValue);
                        this$0.f73862w0 = Integer.valueOf(indexOf);
                    }
                    this$0.f8(num);
                    return;
                }
                return;
            default:
                u this$02 = (u) dVar;
                GestaltText this_apply2 = (GestaltText) textView;
                int i16 = u.A0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(answer, "$answer");
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "it");
                u0 u0Var2 = (u0) CollectionsKt.U(i14, this$02.f73874s0);
                if (u0Var2 != null) {
                    this$02.h8(u0Var2);
                }
                Integer num5 = answer.f38133f;
                if (num5 != null) {
                    int intValue3 = num5.intValue();
                    List list3 = this$02.f73880y0;
                    if (list3 == null) {
                        Intrinsics.r("answerOptions");
                        throw null;
                    }
                    int indexOf2 = list3.indexOf(this_apply2);
                    Integer num6 = this$02.f73875t0;
                    if (num6 != null && indexOf2 == num6.intValue()) {
                        u.j8(this_apply2);
                        this$02.f73875t0 = null;
                    } else {
                        Integer num7 = this$02.f73875t0;
                        if (num7 != null) {
                            int intValue4 = num7.intValue();
                            List list4 = this$02.f73880y0;
                            if (list4 == null) {
                                Intrinsics.r("answerOptions");
                                throw null;
                            }
                            GestaltText gestaltText = (GestaltText) CollectionsKt.U(intValue4, list4);
                            if (gestaltText != null) {
                                u.j8(gestaltText);
                            }
                        }
                        u.i8(this_apply2);
                        num = Integer.valueOf(intValue3);
                        this$02.f73875t0 = Integer.valueOf(indexOf2);
                    }
                    this$02.f8(num);
                    return;
                }
                return;
        }
    }
}
