package n01;

import com.pinterest.api.model.tc0;
import h90.m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p01.i;
import wt1.e0;

/* loaded from: classes5.dex */
public final class b extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public final String f88801h;

    /* renamed from: i, reason: collision with root package name */
    public final tc0 f88802i;

    /* renamed from: j, reason: collision with root package name */
    public final i f88803j;

    public b(String relatedFilterTabsStoryId, tc0 relatedPinsFilterTab, i sheetSelectionListener) {
        Intrinsics.checkNotNullParameter(relatedFilterTabsStoryId, "relatedFilterTabsStoryId");
        Intrinsics.checkNotNullParameter(relatedPinsFilterTab, "relatedPinsFilterTab");
        Intrinsics.checkNotNullParameter(sheetSelectionListener, "sheetSelectionListener");
        this.f88801h = relatedFilterTabsStoryId;
        this.f88802i = relatedPinsFilterTab;
        this.f88803j = sheetSelectionListener;
        o(18992131, new m(this, 13));
        List s13 = relatedPinsFilterTab.s();
        if (s13 != null) {
            k(s13);
        }
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 18992131;
    }
}
