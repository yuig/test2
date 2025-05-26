package vq;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.u;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvq/j;", "Lmf0/f;", "<init>", "()V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class j extends mf0.f {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f126426h0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public String f126427c0;

    /* renamed from: d0, reason: collision with root package name */
    public String f126428d0;

    /* renamed from: f0, reason: collision with root package name */
    public k f126430f0;

    /* renamed from: e0, reason: collision with root package name */
    public List f126429e0 = q0.f80391a;

    /* renamed from: g0, reason: collision with root package name */
    public final i f126431g0 = new AdapterView.OnItemClickListener() { // from class: vq.i
        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
            int i14 = j.f126426h0;
            j this$0 = j.this;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            k kVar = this$0.f126430f0;
            if (kVar == null) {
                Intrinsics.r("adapter");
                throw null;
            }
            kVar.f126434c = i13;
            c cVar = new c();
            String contactRequestId = this$0.f126427c0;
            if (contactRequestId == null) {
                Intrinsics.r("contactRequestId");
                throw null;
            }
            String conversationId = this$0.f126428d0;
            if (conversationId == null) {
                Intrinsics.r("conversationId");
                throw null;
            }
            k kVar2 = this$0.f126430f0;
            if (kVar2 == null) {
                Intrinsics.r("adapter");
                throw null;
            }
            if (kVar2.f126434c == -1) {
                kVar2.f126434c = kVar2.f126433b.size() - 1;
            }
            String reportReason = (String) kVar2.f126433b.get(kVar2.f126434c);
            Intrinsics.checkNotNullExpressionValue(reportReason, "checkedText(...)");
            List filteredUsers = this$0.f126429e0;
            Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            Intrinsics.checkNotNullParameter(reportReason, "reportReason");
            Intrinsics.checkNotNullParameter("message", "blockSource");
            Intrinsics.checkNotNullParameter(filteredUsers, "filteredUsers");
            cVar.f126399f0 = contactRequestId;
            cVar.f126400g0 = conversationId;
            cVar.f126401h0 = reportReason;
            cVar.f126402i0 = "message";
            cVar.f126403j0 = filteredUsers;
            this$0.N6(false, false);
            u.f85943a.d(new of0.a(cVar));
            this$0.N6(false, false);
        }
    };

    @Override // mf0.f
    public final void Z6(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.H = xc0.i.contact_request_report;
        k kVar = new k();
        kVar.f126434c = -1;
        this.f126430f0 = kVar;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String[] stringArray = resources.getStringArray(p60.a.report_contact_request_server_revised_reasons);
        ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(stringArray, stringArray.length)));
        String[] stringArray2 = resources.getStringArray(xc0.a.report_contact_request_revised_reasons);
        ArrayList arrayList2 = new ArrayList(Arrays.asList(Arrays.copyOf(stringArray2, stringArray2.length)));
        arrayList.remove(1);
        arrayList2.remove(1);
        k kVar2 = this.f126430f0;
        if (kVar2 == null) {
            Intrinsics.r("adapter");
            throw null;
        }
        kVar2.f126432a = arrayList2;
        kVar2.f126433b = arrayList;
        this.V = kVar2;
        this.W = this.f126431g0;
        j7();
        super.Z6(inflater);
    }

    public final void p7(String contactRequestId, String conversationId, List filteredUsers) {
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(filteredUsers, "filteredUsers");
        this.f126427c0 = contactRequestId;
        this.f126428d0 = conversationId;
        this.f126429e0 = filteredUsers;
    }
}
