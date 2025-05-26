package rq;

import android.content.res.TypedArray;
import com.pinterest.gestalt.text.previewText.GestaltPreviewTextView;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h3 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109245i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltPreviewTextView f109246j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(GestaltPreviewTextView gestaltPreviewTextView, int i13) {
        super(1);
        this.f109245i = i13;
        this.f109246j = gestaltPreviewTextView;
    }

    public final gm1.c b(Unit it) {
        int i13 = this.f109245i;
        GestaltPreviewTextView gestaltPreviewTextView = this.f109246j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return new rn1.f(gestaltPreviewTextView.getId());
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return new rn1.h(gestaltPreviewTextView.getId());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        un1.j jVar;
        int i13 = this.f109245i;
        GestaltPreviewTextView gestaltPreviewTextView = this.f109246j;
        switch (i13) {
            case 0:
                un1.m bind = (un1.m) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f122899g = 2;
                String f23 = bs1.c.f2(gestaltPreviewTextView, m60.x0.more_no_dot);
                Locale locale = Locale.ROOT;
                String lowerCase = f23.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                bind.f122910r = lowerCase != null ? new u50.f0(lowerCase) : null;
                String lowerCase2 = bs1.c.f2(gestaltPreviewTextView, rf0.c.less).toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                un1.h suffixMode = new un1.h(lowerCase2);
                Intrinsics.checkNotNullParameter(suffixMode, "suffixMode");
                bind.f122908p = suffixMode;
                break;
            case 1:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                int i14 = GestaltPreviewTextView.f49643g;
                gestaltPreviewTextView.getClass();
                String string = $receiver.getString(rn1.o.GestaltText_android_text);
                u50.f0 h23 = string != null ? bs1.c.h2(string) : bs1.c.h2("");
                int i15 = rn1.o.GestaltText_gestalt_textColor;
                ps0.m mVar = vn1.h.f126275a;
                vn1.c cVar = vn1.h.f126277c;
                int i16 = $receiver.getInt(i15, -1);
                if (i16 >= 0) {
                    cVar = vn1.c.values()[i16];
                }
                List B = com.bumptech.glide.c.B($receiver);
                List Z = com.bumptech.glide.c.Z($receiver);
                int i17 = rn1.o.GestaltText_gestalt_textVariant;
                vn1.g gVar = vn1.h.f126278d;
                int i18 = $receiver.getInt(i17, -1);
                vn1.g gVar2 = i18 >= 0 ? vn1.g.values()[i18] : gVar;
                int integer = $receiver.getInteger(rn1.o.GestaltText_android_maxLines, Integer.MAX_VALUE);
                fm1.c Y = d7.b.Y($receiver, rn1.o.GestaltText_android_visibility, mVar.e());
                rm1.d M = com.bumptech.glide.c.M($receiver, rn1.o.GestaltText_gestalt_textStartIcon, rn1.o.GestaltText_gestalt_textStartIconColor, rn1.o.GestaltText_gestalt_textStartIconSize);
                rm1.d M2 = com.bumptech.glide.c.M($receiver, rn1.o.GestaltText_gestalt_textEndIcon, rn1.o.GestaltText_gestalt_textEndIconColor, rn1.o.GestaltText_gestalt_textEndIconSize);
                int resourceId = $receiver.getResourceId(rn1.o.GestaltText_gestalt_textIconPadding, -1);
                u50.b0 b0Var = resourceId >= 0 ? new u50.b0(resourceId) : null;
                boolean z13 = $receiver.getBoolean(rn1.o.GestaltText_gestalt_textSupportLinks, false);
                int id3 = gestaltPreviewTextView.getId();
                String string2 = $receiver.getString(rn1.o.GestaltText_android_contentDescription);
                u50.f0 h24 = string2 != null ? bs1.c.h2(string2) : null;
                Integer b13 = dl2.b.b1($receiver, rn1.o.GestaltText_android_labelFor);
                int i19 = $receiver.getInt(rn1.o.GestaltText_gestalt_suffixMode, 1);
                int i23 = $receiver.getInt(rn1.o.GestaltText_gestalt_ellipsisMode, 1);
                if (i19 == 0) {
                    jVar = new un1.g(i23 == 0 ? un1.d.f122882a : un1.e.f122883a);
                } else {
                    jVar = un1.i.f122887b;
                }
                un1.j jVar2 = jVar;
                int integer2 = $receiver.getInteger(rn1.o.GestaltText_gestalt_textMaxLinesWhenCollapsed, 2);
                String string3 = $receiver.getString(rn1.o.GestaltText_gestalt_suffix);
                break;
            case 2:
                ((Boolean) obj).getClass();
                gestaltPreviewTextView.requestLayout();
                gestaltPreviewTextView.invalidate();
                break;
        }
        return b((Unit) obj);
    }
}
