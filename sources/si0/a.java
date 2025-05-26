package si0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h90.m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nr0.j;
import ti0.b;
import wt1.e0;

/* loaded from: classes5.dex */
public final class a extends e0 implements j {

    /* renamed from: h, reason: collision with root package name */
    public final List f112999h;

    /* renamed from: i, reason: collision with root package name */
    public final ti0.a f113000i;

    /* renamed from: j, reason: collision with root package name */
    public final ti0.a f113001j;

    /* renamed from: k, reason: collision with root package name */
    public final b f113002k;

    public a(List announcementItems, ti0.a aVar, ti0.a aVar2, b bVar) {
        Intrinsics.checkNotNullParameter(announcementItems, "announcementItems");
        this.f112999h = announcementItems;
        this.f113000i = aVar;
        this.f113001j = aVar2;
        this.f113002k = bVar;
        o(RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE, new m(this, 1));
        k(announcementItems);
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return true;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE;
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return true;
    }
}
