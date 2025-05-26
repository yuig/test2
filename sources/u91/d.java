package u91;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f121214b;

    public /* synthetic */ d(h hVar, int i13) {
        this.f121213a = i13;
        this.f121214b = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f121213a;
        h this$0 = this.f121214b;
        switch (i13) {
            case 0:
                int i14 = h.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.requireActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this$0.getString(b52.c.url_support_contact))));
                break;
            case 1:
                int i15 = h.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.requireActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this$0.getString(b52.c.url_linked_business_account_support_page))));
                break;
            default:
                int i16 = h.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.P7();
                break;
        }
    }
}
