package com.bugsnag.android.repackaged.dslplatform.json;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class g implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f29507b;

    public /* synthetic */ g(k kVar, int i13) {
        this.f29506a = i13;
        this.f29507b = kVar;
    }

    @Override // com.bugsnag.android.repackaged.dslplatform.json.u
    public final void a(v vVar, Object obj) {
        switch (this.f29506a) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    vVar.e();
                    return;
                }
                try {
                    this.f29507b.n(vVar, map);
                    return;
                } catch (IOException e13) {
                    throw new SerializationException(e13);
                }
            case 1:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                vVar.e();
                return;
            default:
                vVar.e();
                return;
        }
    }
}
