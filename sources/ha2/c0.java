package ha2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public final class c0 implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f68413a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68414b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f68415c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f68416d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f68417e;

    /* renamed from: f, reason: collision with root package name */
    public final String f68418f;

    /* renamed from: g, reason: collision with root package name */
    public final vn1.g f68419g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f68420h;

    /* renamed from: i, reason: collision with root package name */
    public final vn1.c f68421i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f68422j;

    /* renamed from: k, reason: collision with root package name */
    public final Navigation f68423k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f68424l;

    public c0(int i13, int i14, d0 d0Var, boolean z13, boolean z14, String str, vn1.g gVar, Integer num, Integer num2, NavigationImpl navigationImpl, int i15) {
        d0Var = (i15 & 4) != 0 ? null : d0Var;
        z14 = (i15 & 16) != 0 ? false : z14;
        str = (i15 & 32) != 0 ? null : str;
        gVar = (i15 & 64) != 0 ? null : gVar;
        num = (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : num;
        num2 = (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : num2;
        navigationImpl = (i15 & 1024) != 0 ? null : navigationImpl;
        this.f68413a = i13;
        this.f68414b = i14;
        this.f68415c = d0Var;
        this.f68416d = z13;
        this.f68417e = z14;
        this.f68418f = str;
        this.f68419g = gVar;
        this.f68420h = num;
        this.f68421i = null;
        this.f68422j = num2;
        this.f68423k = navigationImpl;
        this.f68424l = false;
    }

    @Override // ha2.g
    public final int a() {
        return this.f68413a;
    }

    @Override // ha2.g
    public final String b() {
        return this.f68418f;
    }

    @Override // ha2.g
    public final vn1.g c() {
        return this.f68419g;
    }

    @Override // ha2.g
    public final d0 d() {
        return this.f68415c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f68413a == c0Var.f68413a && this.f68414b == c0Var.f68414b && Intrinsics.d(this.f68415c, c0Var.f68415c) && this.f68416d == c0Var.f68416d && this.f68417e == c0Var.f68417e && Intrinsics.d(this.f68418f, c0Var.f68418f) && this.f68419g == c0Var.f68419g && Intrinsics.d(this.f68420h, c0Var.f68420h) && this.f68421i == c0Var.f68421i && Intrinsics.d(this.f68422j, c0Var.f68422j) && Intrinsics.d(this.f68423k, c0Var.f68423k) && this.f68424l == c0Var.f68424l;
    }

    @Override // ha2.g
    public final int getIndex() {
        return this.f68414b;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f68414b, Integer.hashCode(this.f68413a) * 31, 31);
        d0 d0Var = this.f68415c;
        int e13 = ep.b.e(this.f68417e, ep.b.e(this.f68416d, (b13 + (d0Var == null ? 0 : d0Var.hashCode())) * 31, 31), 31);
        String str = this.f68418f;
        int hashCode = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        vn1.g gVar = this.f68419g;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Integer num = this.f68420h;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        vn1.c cVar = this.f68421i;
        int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Integer num2 = this.f68422j;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Navigation navigation = this.f68423k;
        return Boolean.hashCode(this.f68424l) + ((hashCode5 + (navigation != null ? navigation.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SelectionItem(titleRes=");
        sb3.append(this.f68413a);
        sb3.append(", index=");
        sb3.append(this.f68414b);
        sb3.append(", paddings=");
        sb3.append(this.f68415c);
        sb3.append(", selected=");
        sb3.append(this.f68416d);
        sb3.append(", disabled=");
        sb3.append(this.f68417e);
        sb3.append(", titleString=");
        sb3.append(this.f68418f);
        sb3.append(", titleTextVariant=");
        sb3.append(this.f68419g);
        sb3.append(", subtitleRes=");
        sb3.append(this.f68420h);
        sb3.append(", subtitleColorRes=");
        sb3.append(this.f68421i);
        sb3.append(", subtitleLinkRes=");
        sb3.append(this.f68422j);
        sb3.append(", subtitleLinkNavigation=");
        sb3.append(this.f68423k);
        sb3.append(", permanentDisabled=");
        return a.a.r(sb3, this.f68424l, ")");
    }
}
