package cl0;

import d70.g;
import ha2.a0;
import ha2.x;
import ha2.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f27977a = z0.g(new Pair(a.Edit, Integer.valueOf(g.edit_board)), new Pair(a.Merge, Integer.valueOf(g.board_merge_option)), new Pair(a.Share, Integer.valueOf(g.board_share_option)), new Pair(a.Archive, Integer.valueOf(g.archive_board)));

    public static final z a(List boardOptions, Function1 selectionHandler, boolean z13) {
        Intrinsics.checkNotNullParameter(boardOptions, "boardOptions");
        Intrinsics.checkNotNullParameter(selectionHandler, "selectionHandler");
        HashMap hashMap = new HashMap();
        List list = boardOptions;
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            hashMap.put(Integer.valueOf(i13), (a) obj);
            i13 = i14;
        }
        x xVar = new x(g.lego_board_overflow_options_label, null, null, null, null, 30);
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        int i15 = 0;
        for (Object obj2 : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                f0.p();
                throw null;
            }
            a aVar = (a) obj2;
            Integer num = (Integer) f27977a.get(aVar);
            arrayList.add((aVar == a.Edit && z13) ? new a0(g.board_header_image_overflow_option, i15, null, null, null, null, null, null, null, 1020) : new a0(num != null ? num.intValue() : aVar.getTitleResId(), i15, null, null, null, null, null, null, null, 1020));
            i15 = i16;
        }
        return new z(xVar, arrayList, new b(hashMap, selectionHandler, 0));
    }
}
