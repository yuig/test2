package sv0;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicSessionCredentials;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements AWSCredentialsProvider {

    /* renamed from: a, reason: collision with root package name */
    public final String f115325a;

    /* renamed from: b, reason: collision with root package name */
    public final l f115326b;

    public b(String pageId, l s3UploadHelper) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(s3UploadHelper, "s3UploadHelper");
        this.f115325a = pageId;
        this.f115326b = s3UploadHelper;
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    public final AWSCredentials a() {
        Long l13;
        if (l.j(this.f115326b.d(this.f115325a).f115338h)) {
            synchronized (this) {
                try {
                    e d2 = this.f115326b.d(this.f115325a);
                    l lVar = this.f115326b;
                    l13 = d2.f115338h;
                    lVar.getClass();
                } catch (Exception e13) {
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.g.f117075a.q(e13, "Unable to refresh AWS tokens", tb0.p.IDEA_PINS_CREATION);
                }
                if (l.j(l13)) {
                    e s3Params = this.f115326b.k(this.f115325a);
                    l lVar2 = this.f115326b;
                    String pageId = this.f115325a;
                    lVar2.getClass();
                    Intrinsics.checkNotNullParameter(pageId, "pageId");
                    Intrinsics.checkNotNullParameter(s3Params, "s3Params");
                    lVar2.f115360i.put(pageId, s3Params);
                }
            }
        }
        e d13 = this.f115326b.d(this.f115325a);
        return new BasicSessionCredentials(d13.f115335e, d13.f115336f, d13.f115337g);
    }
}
