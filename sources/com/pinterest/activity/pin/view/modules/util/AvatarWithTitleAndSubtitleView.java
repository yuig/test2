package com.pinterest.activity.pin.view.modules.util;

import a.cb;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ba.s;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import dl2.b;
import e0.t;
import ip.d;
import kh2.m0;
import kh2.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import sq.a;
import ye2.o;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/activity/pin/view/modules/util/AvatarWithTitleAndSubtitleView;", "Lcom/pinterest/activity/pin/view/modules/util/AvatarWithRightTextView;", "avatarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AvatarWithTitleAndSubtitleView extends AvatarWithRightTextView implements c {

    /* renamed from: a, reason: collision with root package name */
    public o f35040a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35041b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f35042c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltAvatar f35043d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f35044e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f35045f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f35046g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarWithTitleAndSubtitleView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(CharSequence subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        GestaltText gestaltText = this.f35046g;
        gestaltText.i(new d(3, (String) subtitle));
        gestaltText.i(new d(2, subtitle));
    }

    public final void b(wy0 user) {
        String R;
        Intrinsics.checkNotNullParameter(user, "user");
        GestaltAvatar gestaltAvatar = this.f35043d;
        bs1.c.R1(gestaltAvatar, true);
        m0.V0(gestaltAvatar, user);
        Boolean J3 = user.J3();
        Intrinsics.checkNotNullExpressionValue(J3, "getIsPrivateProfile(...)");
        boolean booleanValue = J3.booleanValue();
        if (this.f35042c || booleanValue) {
            boolean y13 = cb.y(user, "getIsVerifiedMerchant(...)");
            boolean W1 = b.W1(user);
            GestaltText gestaltText = this.f35046g;
            gestaltText.getLayoutParams().width = -2;
            GestaltText gestaltText2 = this.f35045f;
            GestaltText gestaltText3 = ((!a0.R(gestaltText2).contentEquals(bs1.c.f2(this, j60.c.promoted_by)) && !a0.R(gestaltText2).contentEquals(bs1.c.f2(this, j60.c.sponsored_by))) || (R = a0.R(gestaltText)) == null || z.j(R)) ? gestaltText2 : gestaltText;
            gestaltText3.getLayoutParams().width = -2;
            gestaltText3.i(new sq.c(0, booleanValue, y13, W1));
            if (Intrinsics.d(gestaltText3, gestaltText2) && gestaltText3.l().f108857o != null) {
                gestaltText.i(a.f114955k);
            }
            if (Intrinsics.d(gestaltText3, gestaltText) && gestaltText3.l().f108857o != null) {
                gestaltText2.i(a.f114956l);
            }
        }
        t.g(gestaltAvatar, new s(22, this, user));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f35040a == null) {
            this.f35040a = new o(this);
        }
        return this.f35040a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f35040a == null) {
            this.f35040a = new o(this);
        }
        return this.f35040a.generatedComponent();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        r.u(this.f35044e, "AvatarWithTitleAndSubtitleView.rootLayout");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AvatarWithTitleAndSubtitleView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AvatarWithTitleAndSubtitleView(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = r9 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r7 = r1
        L6:
            r0 = r9 & 4
            r2 = 0
            if (r0 == 0) goto Lc
            r8 = r2
        Lc:
            r9 = r9 & 8
            r0 = 1
            if (r9 == 0) goto L12
            r2 = r0
        L12:
            java.lang.String r9 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r9)
            r5.<init>(r6, r7, r8)
            boolean r7 = r5.f35041b
            if (r7 != 0) goto L29
            r5.f35041b = r0
            java.lang.Object r7 = r5.generatedComponent()
            sq.d r7 = (sq.d) r7
            r7.getClass()
        L29:
            r5.f35042c = r2
            com.pinterest.gestalt.avatar.GestaltAvatar r7 = new com.pinterest.gestalt.avatar.GestaltAvatar
            r8 = 6
            r7.<init>(r8, r6, r1)
            r1.j0 r9 = new r1.j0
            r2 = 168258213(0xa076aa5, float:6.520071E-33)
            r9.<init>(r2, r8)
            r7.H2(r9)
            android.widget.RelativeLayout$LayoutParams r9 = new android.widget.RelativeLayout$LayoutParams
            r3 = -2
            r9.<init>(r3, r3)
            r4 = 4
            int r4 = df.j1.Q(r6, r4)
            r9.setMarginEnd(r4)
            r7.setLayoutParams(r9)
            r5.addView(r7)
            r5.f35043d = r7
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r6)
            r7.setOrientation(r0)
            r9 = 15
            r7.setGravity(r9)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r0.<init>(r3, r3)
            r3 = 17
            r0.addRule(r3, r2)
            r0.addRule(r9)
            r7.setLayoutParams(r0)
            com.pinterest.gestalt.text.GestaltText r9 = new com.pinterest.gestalt.text.GestaltText
            r9.<init>(r8, r6, r1)
            dl2.b.y2(r9)
            r7.addView(r9)
            r5.f35045f = r9
            com.pinterest.gestalt.text.GestaltText r9 = new com.pinterest.gestalt.text.GestaltText
            r9.<init>(r8, r6, r1)
            pk.a0.k0(r9)
            dl2.b.y2(r9)
            r7.addView(r9)
            r5.f35046g = r9
            r5.f35044e = r7
            r5.addView(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.activity.pin.view.modules.util.AvatarWithTitleAndSubtitleView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
