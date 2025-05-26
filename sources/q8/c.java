package q8;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f102887a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f102888b;

    /* renamed from: c, reason: collision with root package name */
    public int f102889c;

    /* renamed from: d, reason: collision with root package name */
    public int f102890d;

    /* renamed from: e, reason: collision with root package name */
    public int f102891e;

    /* renamed from: f, reason: collision with root package name */
    public int f102892f;

    /* renamed from: g, reason: collision with root package name */
    public int f102893g;

    public final boolean a(int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        if (!((i13 & (-2097152)) == -2097152) || (i14 = (i13 >>> 19) & 3) == 1 || (i15 = (i13 >>> 17) & 3) == 0 || (i16 = (i13 >>> 12) & 15) == 0 || i16 == 15 || (i17 = (i13 >>> 10) & 3) == 3) {
            return false;
        }
        this.f102887a = i14;
        this.f102888b = b.f102877r[3 - i15];
        int i18 = b.f102878s[i17];
        this.f102890d = i18;
        if (i14 == 2) {
            this.f102890d = i18 / 2;
        } else if (i14 == 0) {
            this.f102890d = i18 / 4;
        }
        int i19 = (i13 >>> 9) & 1;
        int i23 = 1152;
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 3) {
                    throw new IllegalArgumentException();
                }
                i23 = 384;
            }
        } else if (i14 != 3) {
            i23 = 576;
        }
        this.f102893g = i23;
        if (i15 == 3) {
            int i24 = i14 == 3 ? b.f102879t[i16 - 1] : b.f102880u[i16 - 1];
            this.f102892f = i24;
            this.f102889c = (((i24 * 12) / this.f102890d) + i19) * 4;
        } else {
            int i25 = RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM;
            if (i14 == 3) {
                int i26 = i15 == 2 ? b.f102881v[i16 - 1] : b.f102882w[i16 - 1];
                this.f102892f = i26;
                this.f102889c = ((i26 * RecyclerViewTypes.VIEW_TYPE_VTO_CAROUSEL_ITEM) / this.f102890d) + i19;
            } else {
                int i27 = b.f102883x[i16 - 1];
                this.f102892f = i27;
                if (i15 == 1) {
                    i25 = 72;
                }
                this.f102889c = ((i25 * i27) / this.f102890d) + i19;
            }
        }
        this.f102891e = ((i13 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
