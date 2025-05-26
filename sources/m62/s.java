package m62;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import r72.l2;
import r72.z1;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f86045a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86046b;

    /* renamed from: c, reason: collision with root package name */
    public final z1 f86047c;

    /* renamed from: d, reason: collision with root package name */
    public final v f86048d;

    /* renamed from: e, reason: collision with root package name */
    public final List f86049e;

    /* renamed from: f, reason: collision with root package name */
    public final m2 f86050f;

    /* renamed from: g, reason: collision with root package name */
    public final List f86051g;

    /* renamed from: h, reason: collision with root package name */
    public final List f86052h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f86053i;

    /* renamed from: j, reason: collision with root package name */
    public final float f86054j;

    /* renamed from: k, reason: collision with root package name */
    public final l2 f86055k;

    public s(z1 z1Var, String backgroundColor, z1 z1Var2, v currentPanel, List effectCategories, m2 effectsList, List settings, List settingsColorList, boolean z13, float f13, l2 l2Var) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(currentPanel, "currentPanel");
        Intrinsics.checkNotNullParameter(effectCategories, "effectCategories");
        Intrinsics.checkNotNullParameter(effectsList, "effectsList");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(settingsColorList, "settingsColorList");
        this.f86045a = z1Var;
        this.f86046b = backgroundColor;
        this.f86047c = z1Var2;
        this.f86048d = currentPanel;
        this.f86049e = effectCategories;
        this.f86050f = effectsList;
        this.f86051g = settings;
        this.f86052h = settingsColorList;
        this.f86053i = z13;
        this.f86054j = f13;
        this.f86055k = l2Var;
    }

    public static s a(s sVar, z1 z1Var, String str, z1 z1Var2, v vVar, ArrayList arrayList, m2 m2Var, AbstractList abstractList, ArrayList arrayList2, boolean z13, float f13, l2 l2Var, int i13) {
        z1 z1Var3 = (i13 & 1) != 0 ? sVar.f86045a : z1Var;
        String backgroundColor = (i13 & 2) != 0 ? sVar.f86046b : str;
        z1 z1Var4 = (i13 & 4) != 0 ? sVar.f86047c : z1Var2;
        v currentPanel = (i13 & 8) != 0 ? sVar.f86048d : vVar;
        List effectCategories = (i13 & 16) != 0 ? sVar.f86049e : arrayList;
        m2 effectsList = (i13 & 32) != 0 ? sVar.f86050f : m2Var;
        List settings = (i13 & 64) != 0 ? sVar.f86051g : abstractList;
        List settingsColorList = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? sVar.f86052h : arrayList2;
        boolean z14 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? sVar.f86053i : z13;
        float f14 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? sVar.f86054j : f13;
        l2 l2Var2 = (i13 & 1024) != 0 ? sVar.f86055k : l2Var;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(currentPanel, "currentPanel");
        Intrinsics.checkNotNullParameter(effectCategories, "effectCategories");
        Intrinsics.checkNotNullParameter(effectsList, "effectsList");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(settingsColorList, "settingsColorList");
        return new s(z1Var3, backgroundColor, z1Var4, currentPanel, effectCategories, effectsList, settings, settingsColorList, z14, f14, l2Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f86045a, sVar.f86045a) && Intrinsics.d(this.f86046b, sVar.f86046b) && Intrinsics.d(this.f86047c, sVar.f86047c) && Intrinsics.d(this.f86048d, sVar.f86048d) && Intrinsics.d(this.f86049e, sVar.f86049e) && Intrinsics.d(this.f86050f, sVar.f86050f) && Intrinsics.d(this.f86051g, sVar.f86051g) && Intrinsics.d(this.f86052h, sVar.f86052h) && this.f86053i == sVar.f86053i && Float.compare(this.f86054j, sVar.f86054j) == 0 && Intrinsics.d(this.f86055k, sVar.f86055k);
    }

    public final int hashCode() {
        z1 z1Var = this.f86045a;
        int d2 = cb.d(this.f86046b, (z1Var == null ? 0 : z1Var.hashCode()) * 31, 31);
        z1 z1Var2 = this.f86047c;
        int a13 = a.a.a(this.f86054j, ep.b.e(this.f86053i, ep.b.c(this.f86052h, ep.b.c(this.f86051g, (this.f86050f.hashCode() + ep.b.c(this.f86049e, (this.f86048d.hashCode() + ((d2 + (z1Var2 == null ? 0 : z1Var2.hashCode())) * 31)) * 31, 31)) * 31, 31), 31), 31), 31);
        l2 l2Var = this.f86055k;
        return a13 + (l2Var != null ? l2Var.hashCode() : 0);
    }

    public final String toString() {
        return "EffectsModel(item=" + this.f86045a + ", backgroundColor=" + this.f86046b + ", effectPreviewItem=" + this.f86047c + ", currentPanel=" + this.f86048d + ", effectCategories=" + this.f86049e + ", effectsList=" + this.f86050f + ", settings=" + this.f86051g + ", settingsColorList=" + this.f86052h + ", textSizeSliderVisible=" + this.f86053i + ", textSizeSliderValue=" + this.f86054j + ", textEditorData=" + this.f86055k + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s() {
        /*
            r12 = this;
            m62.u r4 = m62.u.f86059a
            kotlin.collections.q0 r8 = kotlin.collections.q0.f80391a
            m62.p r6 = new m62.p
            r6.<init>(r8)
            r1 = 0
            java.lang.String r2 = ""
            r3 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r0 = r12
            r5 = r8
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m62.s.<init>():void");
    }
}
