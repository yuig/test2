package yx;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import zx.e;
import zx.g;
import zx.h;
import zx.i;
import zx.k;
import zx.l;

/* loaded from: classes3.dex */
public interface a {
    static l a(a aVar, g gVar, zx.d dVar, e eVar, zx.c cVar, i iVar, k kVar, h hVar, ArrayList arrayList, zx.b bVar, boolean z13, int i13) {
        g dateRange = (i13 & 1) != 0 ? ((c) aVar).f140326c.f142973a : gVar;
        zx.d contentTypeFilter = (i13 & 2) != 0 ? ((c) aVar).f140326c.f142974b : dVar;
        e contentTypePinFormat = (i13 & 4) != 0 ? ((c) aVar).f140326c.f142975c : eVar;
        zx.c contentTypeAdFormat = (i13 & 8) != 0 ? ((c) aVar).f140326c.f142976d : cVar;
        i formatFilter = (i13 & 16) != 0 ? ((c) aVar).f140326c.f142981i : iVar;
        k sourceFilter = (i13 & 32) != 0 ? ((c) aVar).f140326c.f142980h : kVar;
        h deviceFilter = (i13 & 64) != 0 ? ((c) aVar).f140326c.f142979g : hVar;
        List claimedAccountOptions = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ((c) aVar).f140326c.f142978f : arrayList;
        zx.b claimedAccountFilter = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ((c) aVar).f140326c.f142977e : bVar;
        boolean z14 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ((c) aVar).f140326c.f142982j : z13;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(dateRange, "dateRange");
        Intrinsics.checkNotNullParameter(contentTypeFilter, "contentTypeFilter");
        Intrinsics.checkNotNullParameter(contentTypePinFormat, "contentTypePinFormat");
        Intrinsics.checkNotNullParameter(contentTypeAdFormat, "contentTypeAdFormat");
        Intrinsics.checkNotNullParameter(formatFilter, "formatFilter");
        Intrinsics.checkNotNullParameter(sourceFilter, "sourceFilter");
        Intrinsics.checkNotNullParameter(deviceFilter, "deviceFilter");
        Intrinsics.checkNotNullParameter(claimedAccountOptions, "claimedAccountOptions");
        Intrinsics.checkNotNullParameter(claimedAccountFilter, "claimedAccountFilter");
        c cVar2 = (c) aVar;
        cVar2.f140326c.getClass();
        l a13 = l.a(claimedAccountFilter, contentTypeAdFormat, contentTypeFilter, contentTypePinFormat, dateRange, deviceFilter, formatFilter, sourceFilter, claimedAccountOptions, z14);
        Intrinsics.checkNotNullParameter(a13, "<set-?>");
        cVar2.f140326c = a13;
        return a13;
    }
}
