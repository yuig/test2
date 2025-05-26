package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final j0[] f46338a;

    /* renamed from: b, reason: collision with root package name */
    public final j0[] f46339b;

    /* renamed from: c, reason: collision with root package name */
    public final View f46340c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean[] f46341d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean[] f46342e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46343f;

    /* renamed from: g, reason: collision with root package name */
    public int f46344g;

    /* renamed from: h, reason: collision with root package name */
    public float f46345h;

    /* renamed from: i, reason: collision with root package name */
    public float f46346i;

    /* renamed from: j, reason: collision with root package name */
    public int f46347j;

    /* renamed from: k, reason: collision with root package name */
    public int f46348k;

    public v1(j0[] xGuidelineConfigs, j0[] yGuidelineConfigs, View rotationGuideline) {
        Intrinsics.checkNotNullParameter(xGuidelineConfigs, "xGuidelineConfigs");
        Intrinsics.checkNotNullParameter(yGuidelineConfigs, "yGuidelineConfigs");
        Intrinsics.checkNotNullParameter(rotationGuideline, "rotationGuideline");
        this.f46338a = xGuidelineConfigs;
        this.f46339b = yGuidelineConfigs;
        this.f46340c = rotationGuideline;
        Boolean bool = Boolean.FALSE;
        this.f46341d = new Boolean[]{bool, bool, bool};
        this.f46342e = new Boolean[]{bool, bool, bool};
    }

    public final void a() {
        Boolean[] boolArr = this.f46341d;
        int length = boolArr.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            boolArr[i13].getClass();
            boolArr[i14] = Boolean.FALSE;
            i13++;
            i14++;
        }
        Boolean[] boolArr2 = this.f46342e;
        int length2 = boolArr2.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length2) {
            boolArr2[i15].getClass();
            boolArr[i16] = Boolean.FALSE;
            i15++;
            i16++;
        }
        this.f46343f = false;
        this.f46345h = 0.0f;
        this.f46346i = 0.0f;
        this.f46347j = 0;
        this.f46348k = 0;
        for (j0 j0Var : this.f46338a) {
            bs1.c.X0(j0Var.f46205a);
        }
        for (j0 j0Var2 : this.f46339b) {
            bs1.c.X0(j0Var2.f46205a);
        }
        bs1.c.X0(this.f46340c);
    }

    public final void b(int i13, float f13, int i14) {
        View view = this.f46340c;
        view.setRotation(0.0f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = i13 - (marginLayoutParams.width / 2);
        marginLayoutParams.topMargin = i14;
        view.setLayoutParams(marginLayoutParams);
        view.setRotation(f13);
        kg.a.s(view, 0L, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008e, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.pinterest.feature.ideaPinCreation.closeup.view.w1 c(android.graphics.RectF r23, int r24) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.closeup.view.v1.c(android.graphics.RectF, int):com.pinterest.feature.ideaPinCreation.closeup.view.w1");
    }
}
