package h3;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f66615a;

    /* renamed from: b, reason: collision with root package name */
    public final float f66616b;

    /* renamed from: c, reason: collision with root package name */
    public final float f66617c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66618d;

    /* renamed from: e, reason: collision with root package name */
    public final float f66619e;

    /* renamed from: f, reason: collision with root package name */
    public final float f66620f;

    /* renamed from: g, reason: collision with root package name */
    public final float f66621g;

    /* renamed from: h, reason: collision with root package name */
    public final float f66622h;

    /* renamed from: i, reason: collision with root package name */
    public final List f66623i;

    /* renamed from: j, reason: collision with root package name */
    public final List f66624j;

    public d(String str, float f13, float f14, float f15, float f16, float f17, float f18, float f19, List list, int i13) {
        str = (i13 & 1) != 0 ? "" : str;
        f13 = (i13 & 2) != 0 ? 0.0f : f13;
        f14 = (i13 & 4) != 0 ? 0.0f : f14;
        f15 = (i13 & 8) != 0 ? 0.0f : f15;
        f16 = (i13 & 16) != 0 ? 1.0f : f16;
        f17 = (i13 & 32) != 0 ? 1.0f : f17;
        f18 = (i13 & 64) != 0 ? 0.0f : f18;
        f19 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? 0.0f : f19;
        list = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? h0.f66696a : list;
        ArrayList arrayList = new ArrayList();
        this.f66615a = str;
        this.f66616b = f13;
        this.f66617c = f14;
        this.f66618d = f15;
        this.f66619e = f16;
        this.f66620f = f17;
        this.f66621g = f18;
        this.f66622h = f19;
        this.f66623i = list;
        this.f66624j = arrayList;
    }
}
