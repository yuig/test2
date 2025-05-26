package hd;

import com.bugsnag.android.repackaged.dslplatform.json.u;
import com.bugsnag.android.repackaged.dslplatform.json.v;
import java.util.Date;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements u {
    @Override // com.bugsnag.android.repackaged.dslplatform.json.u
    public final void a(v vVar, Object obj) {
        Date date = (Date) obj;
        if (date == null) {
            return;
        }
        vVar.g(e.b(date));
    }
}
