package fs0;

import com.pinterest.api.model.ym;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends n {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f62837d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f62838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ls0.f viewParams, boolean z13, boolean z14) {
        super(jo1.a.HOMEFEED, viewParams);
        Intrinsics.checkNotNullParameter(viewParams, "viewParams");
        this.f62837d = z13;
        this.f62838e = z14;
    }

    @Override // fs0.n
    public final List a(l config) {
        Intrinsics.checkNotNullParameter(config, "config");
        ArrayList l13 = f0.l(es0.a.DIVIDER_WITH_BOTTOM_SPACE);
        l13.add(es0.a.SEND);
        ls0.f fVar = this.f62884b;
        if (n.b(fVar.f84637l, config.f62874g, config.f62876i)) {
            l13.add(es0.a.DOWNLOAD);
        }
        if (this.f62837d) {
            l13.add(es0.a.STOP_SEEING_PIN);
        }
        ym ymVar = fVar.H;
        if (ymVar != null) {
            if (this.f62838e) {
                l13.add(es0.a.GEN_AI_TOPICS_OPT_OUT);
            } else {
                Iterator it = l13.iterator();
                int i13 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i13 = -1;
                        break;
                    }
                    if (((es0.a) it.next()) == es0.a.DIVIDER_WITH_BOTTOM_SPACE) {
                        break;
                    }
                    i13++;
                }
                l13.add(i13 + 1, es0.a.GEN_AI_TOPICS_OPT_OUT);
            }
        }
        int i14 = e.f62836a[fVar.f84626a.ordinal()];
        es0.a aVar = null;
        es0.a aVar2 = i14 != 1 ? (i14 == 2 || i14 == 3) ? es0.a.UNFOLLOW : i14 != 4 ? i14 != 5 ? null : es0.a.STOP_SEEING_SELF_BOARD_PINS : es0.a.STOP_SEEING_TOPIC_PINS : es0.a.STOP_SEEING_BOARD_PINS;
        boolean z13 = aVar2 == es0.a.STOP_SEEING_TOPIC_PINS;
        boolean z14 = aVar2 == es0.a.STOP_SEEING_SELF_BOARD_PINS;
        if (ymVar == null || (!z13 && !z14)) {
            aVar = aVar2;
        }
        if (aVar != null) {
            l13.add(aVar);
        }
        if (!config.f62871d) {
            l13.add(es0.a.REPORT);
        }
        l13.add(es0.a.DIVIDER_WITH_TOP_SPACE);
        if (ymVar != null) {
            l13.add(es0.a.GEN_AI_APPEND_REASON);
        } else {
            l13.add(es0.a.REASON);
        }
        return l13;
    }
}
