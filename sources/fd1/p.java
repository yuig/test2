package fd1;

import android.view.View;
import com.pinterest.feature.sharesheet.view.InviteModalAppView;
import com.pinterest.feature.sharesheet.view.SharesheetModalAppView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g91.d f61986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ os.g f61987c;

    public /* synthetic */ p(g91.d dVar, os.g gVar, int i13) {
        this.f61985a = i13;
        this.f61986b = dVar;
        this.f61987c = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f61985a;
        os.g contact = this.f61987c;
        g91.d listener = this.f61986b;
        switch (i13) {
            case 0:
                int i14 = InviteModalAppView.f48397f;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                Intrinsics.checkNotNullParameter(contact, "$contact");
                listener.a(view, contact.f97486c);
                break;
            default:
                int i15 = SharesheetModalAppView.f48414f;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                Intrinsics.checkNotNullParameter(contact, "$contact");
                listener.a(view, contact.f97486c);
                break;
        }
    }
}
