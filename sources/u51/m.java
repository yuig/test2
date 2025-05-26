package u51;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class m extends n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f120633e;

    /* JADX WARN: Removed duplicated region for block: B:89:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b7 A[SYNTHETIC] */
    @Override // u51.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList a() {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u51.m.a():java.util.ArrayList");
    }

    @Override // u51.n
    public final int b() {
        switch (this.f120633e) {
            case 0:
                return w02.b.against_policies;
            case 1:
                return w02.b.hurtful_content;
            case 2:
                return w02.b.my_intellectual_property;
            case 3:
                return w02.b.this_is_spam;
            case 4:
                return w02.b.report_did_it_harassment_content_title;
            default:
                return w02.b.report_did_it_content_title;
        }
    }

    @Override // u51.n
    public final ArrayList d() {
        switch (this.f120633e) {
            case 0:
                ArrayList arrayList = new ArrayList();
                arrayList.add(x.POLICY_NUDITY);
                arrayList.add(x.POLICY_HURTFUL_CONTENT);
                arrayList.add(x.POLICY_GORE);
                return arrayList;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(x.HURTFUL_CONTENT_HARASSING_ME_OR_CHILD);
                arrayList2.add(x.HURTFUL_CONTENT_HARASSING_FRIEND);
                arrayList2.add(x.HURTFUL_CONTENT_HARASSING_PUBLIC_FIGURE);
                arrayList2.add(x.HURTFUL_CONTENT_HATE_SPEECH);
                arrayList2.add(x.HURTFUL_CONTENT_SELF_HARM);
                return arrayList2;
            case 2:
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(x.FILE_IP_REPORT);
                return arrayList3;
            case 3:
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(x.SPAM_REPETITIVE_SPAM);
                arrayList4.add(x.SPAM_FAKE_ACCOUNT);
                arrayList4.add(x.SPAM_HACKED_ACCOUNT);
                return arrayList4;
            case 4:
                ArrayList arrayList5 = new ArrayList();
                arrayList5.add(x.DID_IT_HARASSMENT_ME_CHILD);
                arrayList5.add(x.DID_IT_HARASSMENT_ATTACKS);
                arrayList5.add(x.DID_IT_HARASSMENT_SOMETHING_ELSE);
                return arrayList5;
            default:
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(x.DID_IT_ON_PINTEREST_SEXUALLY);
                arrayList6.add(x.DID_IT_ON_PINTEREST_SELF_HARM);
                arrayList6.add(x.DID_IT_ON_PINTEREST_HATE);
                arrayList6.add(x.DID_IT_ON_PINTEREST_HARASS);
                arrayList6.add(x.DID_IT_ON_PINTEREST_GRAPHIC);
                arrayList6.add(x.DID_IT_ON_PINTEREST_IP);
                return arrayList6;
        }
    }
}
