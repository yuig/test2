package com.pinterest.gestalt.text;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.firebase.messaging.q;
import df.j1;
import gm1.a;
import gm1.b;
import i1.e1;
import i2.i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p11.r;
import rn1.c;
import rn1.d;
import rn1.m;
import tb.e;
import u50.o;
import vn1.g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0003\f\u0003\rB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/pinterest/gestalt/text/GestaltText;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lgm1/b;", "Lrn1/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ps0/m", "rn1/b", "text_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class GestaltText extends m implements b {

    /* renamed from: g */
    public static final rn1.b f49638g = rn1.b.NONE;

    /* renamed from: c */
    public final q f49639c;

    /* renamed from: d */
    public final e f49640d;

    /* renamed from: e */
    public View.OnClickListener f49641e;

    /* renamed from: f */
    public View.OnLongClickListener f49642f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltText(Context context) {
        this(6, context, (AttributeSet) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final GestaltText i(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        return (GestaltText) this.f49639c.d(nextState, new i(28, this, l()));
    }

    public final GestaltText j(a eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        return (GestaltText) this.f49639c.c(eventHandler, new e1(this, !Intrinsics.d((a) r0.f33804b, eventHandler), 5));
    }

    public final void k(View.OnClickListener onClickListener) {
        this.f49641e = onClickListener;
        n(false);
        vn1.i iVar = (vn1.i) this.f49640d.f116964b;
        if (iVar != null) {
            if (iVar != null) {
                iVar.f126286c = onClickListener;
            } else {
                Intrinsics.r("gestaltTextLinkMovementMethod");
                throw null;
            }
        }
    }

    public final rn1.a l() {
        return (rn1.a) ((o) this.f49639c.f33803a);
    }

    public final void m(rn1.a aVar, rn1.e eVar) {
        g f13;
        g[] gVarArr;
        this.f49640d.j(aVar, eVar, (a) this.f49639c.f33804b);
        j1.v(aVar, eVar, d.f108870j, new r(this, 2));
        Integer num = null;
        if ((aVar != null ? aVar.f108862t : null) == eVar.g()) {
            if ((aVar != null ? aVar.f108863u : null) == eVar.f()) {
                return;
            }
        }
        g g13 = eVar.g();
        if (g13 == null || (f13 = eVar.f()) == null) {
            return;
        }
        switch (c.f108869a[eVar.v().ordinal()]) {
            case 1:
                gVarArr = new g[]{g.HEADING_600, g.HEADING_700, g.HEADING_XL};
                break;
            case 2:
                gVarArr = new g[]{g.HEADING_600, g.HEADING_700};
                break;
            case 3:
                gVarArr = new g[]{g.BODY_300, g.HEADING_600};
                break;
            case 4:
                gVarArr = new g[]{g.BODY_300, g.HEADING_500};
                break;
            case 5:
                gVarArr = new g[]{g.HEADING_300, g.HEADING_400};
                break;
            case 6:
                gVarArr = new g[]{g.HEADING_200, g.HEADING_300};
                break;
            case 7:
                gVarArr = new g[]{g.HEADING_200, g.HEADING_300};
                break;
            case 8:
                gVarArr = new g[]{g.BODY_300, g.BODY_400};
                break;
            case 9:
                gVarArr = new g[]{g.BODY_200, g.BODY_300};
                break;
            case 10:
                gVarArr = new g[]{g.BODY_100, g.BODY_200, g.HEADING_600};
                break;
            case 11:
                gVarArr = new g[]{g.BODY_100, g.BODY_200};
                break;
            case 12:
                gVarArr = new g[]{g.UI_300, g.UI_400};
                break;
            case 13:
                gVarArr = new g[]{g.UI_200, g.UI_300};
                break;
            case 14:
                gVarArr = new g[]{g.UI_100, g.UI_200, g.UI_300};
                break;
            case 15:
                gVarArr = new g[]{g.UI_100, g.UI_200};
                break;
            case 16:
                gVarArr = new g[]{g.COMPACT_100, g.BODY_200};
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int K = c0.K(gVarArr, g13);
        Integer valueOf = Integer.valueOf(K);
        if (K < 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        int K2 = c0.K(gVarArr, f13);
        Integer valueOf2 = Integer.valueOf(K2);
        if (K2 >= 0 && K2 < gVarArr.length) {
            num = valueOf2;
        }
        Object[] n13 = z.n(intValue, (num != null ? num.intValue() : gVarArr.length - 1) + 1, gVarArr);
        ArrayList arrayList = new ArrayList(n13.length);
        for (Object obj : n13) {
            arrayList.add(Integer.valueOf(dl2.b.G0(this, ((g) obj).getFontSize())));
        }
        int[] E0 = CollectionsKt.E0(arrayList);
        if (Build.VERSION.SDK_INT >= 27) {
            setAutoSizeTextTypeUniformWithPresetSizes(E0, 0);
        } else {
            setAutoSizeTextTypeUniformWithPresetSizes(E0, 0);
        }
    }

    public final void n(boolean z13) {
        r rVar = new r(this, 3);
        r rVar2 = new r(this, 4);
        q qVar = this.f49639c;
        qVar.F(rVar, rVar2);
        qVar.I(new r(this, 5), new r(this, 6));
        if (l().f108859q && z13) {
            a aVar = (a) qVar.f33804b;
            vn1.i iVar = (vn1.i) this.f49640d.f116964b;
            if (iVar != null) {
                iVar.f126284a = aVar;
            } else {
                Intrinsics.r("gestaltTextLinkMovementMethod");
                throw null;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        try {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltText(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltText(Context context, rn1.a initialDisplayState) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        this.f49639c = new q(this, initialDisplayState);
        this.f49640d = new e((AppCompatTextView) this);
        m(null, initialDisplayState);
    }

    public /* synthetic */ GestaltText(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltText(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] GestaltText = rn1.o.GestaltText;
        Intrinsics.checkNotNullExpressionValue(GestaltText, "GestaltText");
        this.f49639c = new q(this, attributeSet, i13, GestaltText, new r(this, 1));
        this.f49640d = new e((AppCompatTextView) this);
        m(null, l());
    }
}
