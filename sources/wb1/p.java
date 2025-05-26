package wb1;

import android.content.Context;
import c2.m4;
import com.pinterest.feature.settings.shared.view.SettingsHeaderTextItemView;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zt0.b f129048b;

    public p(zt0.b bVar, int i13) {
        this.f129047a = i13;
        this.f129048b = bVar;
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        switch (this.f129047a) {
            case 0:
                SettingsHeaderTextItemView view = (SettingsHeaderTextItemView) nVar;
                c model = (c) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                view.a(model);
                break;
            default:
                q view2 = (q) nVar;
                h model2 = (h) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                view2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                Iterator it = model2.f129019h.iterator();
                int i14 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i14 = -1;
                    } else if (!((g) it.next()).f129017i) {
                        i14++;
                    }
                }
                view2.a().t(new m4(model2, i14, 15));
                break;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        int i14 = this.f129047a;
        zt0.b bVar = this.f129048b;
        switch (i14) {
            case 0:
                c model = (c) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                String string = ((Context) bVar.f142767m).getString(g52.c.mention_control_details_settings_header_text_item_content_description);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            default:
                h model2 = (h) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                String string2 = ((Context) bVar.f142767m).getString(g52.c.mention_control_details_settings_toggle_item_content_description);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
        }
    }
}
