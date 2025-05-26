package com.bugsnag.android;

import java.io.File;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class l3 extends id.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f29332e;

    public /* synthetic */ l3(z zVar, int i13) {
        this.f29331d = i13;
        this.f29332e = zVar;
    }

    @Override // id.d
    public final Object c() {
        int i13 = this.f29331d;
        z zVar = this.f29332e;
        switch (i13) {
            case 0:
                File file = (File) zVar.f29708c.f68833y.getValue();
                File file2 = new File(file, "bugsnag");
                if (!file2.isDirectory()) {
                    file2.mkdirs();
                }
                for (Pair pair : kotlin.collections.f0.j(new Pair("last-run-info", "last-run-info"), new Pair("bugsnag-sessions", "sessions"), new Pair("user-info", "user-info"), new Pair("bugsnag-native", "native"), new Pair("bugsnag-errors", "errors"))) {
                    String str = (String) pair.f80346a;
                    String str2 = (String) pair.f80347b;
                    File file3 = new File(file, str);
                    if (file3.exists()) {
                        file3.renameTo(new File(file2, str2));
                    }
                }
                return file2;
            case 1:
                boolean z13 = zVar.f29708c.f68824p;
                w wVar = new w(zVar.f29711f, 2);
                zVar.f72116a.a(zVar.f72117b, wVar);
                return new d4(z13, zVar.f29709d, wVar, zVar.f29710e, zVar.f29708c.f68826r);
            case 2:
                return new r1(zVar.f29708c);
            default:
                File file4 = (File) zVar.f29709d.get();
                hd.h hVar = zVar.f29708c;
                return new l2(file4, hVar.f68829u, hVar.f68809a, hVar.f68826r);
        }
    }
}
