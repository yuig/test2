package a7;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f977a;

    /* renamed from: b, reason: collision with root package name */
    public int f978b;

    /* renamed from: c, reason: collision with root package name */
    public int f979c;

    /* renamed from: d, reason: collision with root package name */
    public int f980d;

    /* renamed from: e, reason: collision with root package name */
    public int f981e;

    public e() {
        this.f977a = 0;
    }

    public boolean a() {
        int i13 = this.f977a;
        int i14 = 2;
        if ((i13 & 7) != 0) {
            int i15 = this.f980d;
            int i16 = this.f978b;
            if (((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) != 0) {
            int i17 = this.f980d;
            int i18 = this.f979c;
            if ((((i17 > i18 ? 1 : i17 == i18 ? 2 : 4) << 4) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 1792) != 0) {
            int i19 = this.f981e;
            int i23 = this.f978b;
            if ((((i19 > i23 ? 1 : i19 == i23 ? 2 : 4) << 8) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 28672) != 0) {
            int i24 = this.f981e;
            int i25 = this.f979c;
            if (i24 > i25) {
                i14 = 1;
            } else if (i24 != i25) {
                i14 = 4;
            }
            if ((i13 & (i14 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    public void b(int i13) {
        if (this.f980d != 0) {
            throw new IllegalStateException("Cannot set loadingContainerId if swipeRefreshId has already been set. Please use one or the other.".toString());
        }
        this.f981e = i13;
    }

    public void c(int i13) {
        if (this.f981e != 0) {
            throw new IllegalStateException("Cannot set swipeRefreshId if loadingContainerId has already been set. Please use one or the other.".toString());
        }
        this.f980d = i13;
    }

    public e(int i13, int i14) {
        if (i13 != 0 && i14 != 0) {
            this.f977a = i13;
            this.f978b = i14;
            return;
        }
        throw new IllegalStateException("layoutId and recyclerViewId is required and must be non-zero".toString());
    }
}
