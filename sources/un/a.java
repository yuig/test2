package un;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.linecorp.linesdk.ManifestParser;
import com.linecorp.linesdk.api.LineEnvConfig;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f122813a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f122814b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f122815c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f122816d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f122817e;

    public a(Context context, String str) {
        ManifestParser manifestParser = new ManifestParser();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("channelId is empty.");
        }
        this.f122813a = str;
        LineEnvConfig parse = context != null ? manifestParser.parse(context) : null;
        parse = parse == null ? new sn.b() : parse;
        this.f122814b = Uri.parse(parse.getOpenIdDiscoveryDocumentUrl());
        this.f122815c = Uri.parse(parse.getApiServerBaseUri());
        this.f122816d = Uri.parse(parse.getWebLoginPageUrl());
    }
}
