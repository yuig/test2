package vr1;

import android.content.res.TypedArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.f0;
import u50.h0;
import u50.i0;

/* loaded from: classes4.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126463i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TypedArray f126464j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(TypedArray typedArray, int i13) {
        super(1);
        this.f126463i = i13;
        this.f126464j = typedArray;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i0 labelText;
        int i13 = this.f126463i;
        TypedArray typedArray = this.f126464j;
        switch (i13) {
            case 0:
                ao1.i bind = (ao1.i) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                CharSequence string = typedArray.getText(yr1.d.StrongPasswordTextField_strong_password_field_labelText);
                i0 hintText = h0.f120562a;
                if (string != null) {
                    Intrinsics.checkNotNullParameter(string, "string");
                    labelText = new f0(string);
                } else {
                    labelText = hintText;
                }
                bind.getClass();
                Intrinsics.checkNotNullParameter(labelText, "labelText");
                bind.f20085b = labelText;
                CharSequence string2 = typedArray.getText(yr1.d.StrongPasswordTextField_strong_password_field_hintText);
                if (string2 != null) {
                    Intrinsics.checkNotNullParameter(string2, "string");
                    hintText = new f0(string2);
                }
                Intrinsics.checkNotNullParameter(hintText, "hintText");
                bind.f20088e = hintText;
                return Unit.f80348a;
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(String.valueOf(typedArray.getString(com.pinterest.partnerAnalytics.h.MetaDataView_metadata_description))), null, null, null, vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
        }
    }
}
