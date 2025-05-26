package a0;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Range;
import android.widget.TextView;
import androidx.camera.core.impl.h0;
import androidx.camera.core.impl.v2;
import bk.o;
import c0.r;
import com.bumptech.glide.d;
import fj.m;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kh2.m0;
import kh2.n3;
import p5.f;
import q5.v0;
import sp2.i;
import y0.b;

/* loaded from: classes2.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public int f202a;

    /* renamed from: b, reason: collision with root package name */
    public Object f203b;

    /* renamed from: c, reason: collision with root package name */
    public Object f204c;

    /* renamed from: d, reason: collision with root package name */
    public Object f205d;

    /* renamed from: e, reason: collision with root package name */
    public Object f206e;

    /* renamed from: f, reason: collision with root package name */
    public Object f207f;

    public static a a(Context context, int i13) {
        d.g("Cannot create a CalendarItemStyle with a styleResId of 0", i13 != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i13, m.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(m.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(m.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(m.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(m.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList H = d.H(context, obtainStyledAttributes, m.MaterialCalendarItem_itemFillColor);
        ColorStateList H2 = d.H(context, obtainStyledAttributes, m.MaterialCalendarItem_itemTextColor);
        ColorStateList H3 = d.H(context, obtainStyledAttributes, m.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(m.MaterialCalendarItem_itemStrokeWidth, 0);
        o a13 = o.c(context, obtainStyledAttributes.getResourceId(m.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(m.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).a();
        obtainStyledAttributes.recycle();
        a aVar = new a();
        d.l(rect.left);
        d.l(rect.top);
        d.l(rect.right);
        d.l(rect.bottom);
        aVar.f203b = rect;
        aVar.f204c = H2;
        aVar.f205d = H;
        aVar.f206e = H3;
        aVar.f202a = dimensionPixelSize;
        aVar.f207f = a13;
        return aVar;
    }

    public final String b(String str) {
        Map map = (Map) this.f206e;
        if (!map.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) map.get(str)) {
            Iterator it = ((List) this.f205d).iterator();
            while (it.hasNext()) {
                h0 k13 = ((h0) ((r) it.next())).k();
                d.g("CameraInfo doesn't contain Camera2 implementation.", k13 instanceof v.h0);
                i iVar = ((v.h0) k13).f123491c;
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(iVar.f114929c);
                if (str2.equals(((v.h0) iVar.f114928b).f123489a)) {
                    return str2;
                }
            }
        }
        return null;
    }

    public final void c(TextView textView) {
        bk.i iVar = new bk.i();
        bk.i iVar2 = new bk.i();
        o oVar = (o) this.f207f;
        iVar.Y0(oVar);
        iVar2.Y0(oVar);
        iVar.t((ColorStateList) this.f205d);
        float f13 = this.f202a;
        ColorStateList colorStateList = (ColorStateList) this.f206e;
        iVar.f23052a.f23040k = f13;
        iVar.invalidateSelf();
        iVar.y(colorStateList);
        Object obj = this.f204c;
        textView.setTextColor((ColorStateList) obj);
        RippleDrawable rippleDrawable = new RippleDrawable(((ColorStateList) obj).withAlpha(30), iVar, iVar2);
        Rect rect = (Rect) this.f203b;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap weakHashMap = v0.f102521a;
        textView.setBackground(insetDrawable);
    }

    @Override // p5.f
    public final Object get() {
        m0.p("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        Range range = ((r0.a) this.f205d).f105471a;
        androidx.camera.core.impl.d dVar = (androidx.camera.core.impl.d) this.f207f;
        int i13 = dVar.f16816c;
        u0.i iVar = (u0.i) this.f206e;
        int I0 = n3.I0(i13, iVar.f119772c, dVar.f16818e, iVar.f119771b, dVar.f16817d, range);
        b bVar = new b();
        bVar.f136260b = -1;
        String str = (String) this.f203b;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        bVar.f136259a = str;
        bVar.f136260b = Integer.valueOf(this.f202a);
        v2 v2Var = (v2) this.f204c;
        if (v2Var == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        bVar.f136261c = v2Var;
        bVar.f136264f = Integer.valueOf(iVar.f119772c);
        bVar.f136263e = Integer.valueOf(iVar.f119771b);
        bVar.f136262d = Integer.valueOf(I0);
        return bVar.a();
    }
}
