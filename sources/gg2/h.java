package gg2;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kh2.g3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final yf2.a f64988a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f64989b;

    /* renamed from: c, reason: collision with root package name */
    public final sg2.a f64990c;

    /* renamed from: d, reason: collision with root package name */
    public final uh2.b f64991d;

    /* renamed from: e, reason: collision with root package name */
    public final ki2.a f64992e;

    /* renamed from: f, reason: collision with root package name */
    public Future f64993f;

    public h(yf2.a buildInfo, Context context, sg2.a configService, uh2.b preferencesService, ki2.a metadataBackgroundWorker) {
        Future c13;
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        Intrinsics.checkNotNullParameter(metadataBackgroundWorker, "metadataBackgroundWorker");
        this.f64988a = buildInfo;
        this.f64989b = context;
        this.f64990c = configService;
        this.f64991d = preferencesService;
        this.f64992e = metadataBackgroundWorker;
        if (((sg2.b) configService).f112890o == th2.g.REACT_NATIVE) {
            final int i13 = 0;
            c13 = metadataBackgroundWorker.c(new Callable(this) { // from class: gg2.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f64987b;

                {
                    this.f64987b = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i14 = i13;
                    h hVar = this.f64987b;
                    switch (i14) {
                        case 0:
                            String string = ((uh2.a) hVar.f64991d).f122252a.getString("io.embrace.jsbundle.url", null);
                            String string2 = ((uh2.a) hVar.f64991d).f122252a.getString("io.embrace.jsbundle.id", null);
                            if (string != null && string.length() != 0 && string2 != null && string2.length() != 0) {
                                return string2;
                            }
                            return g3.E(hVar.f64989b, string, hVar.f64988a.f138999d);
                        default:
                            return hVar.f64988a.f138996a;
                    }
                }
            });
        } else {
            final int i14 = 1;
            c13 = metadataBackgroundWorker.c(new Callable(this) { // from class: gg2.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f64987b;

                {
                    this.f64987b = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i142 = i14;
                    h hVar = this.f64987b;
                    switch (i142) {
                        case 0:
                            String string = ((uh2.a) hVar.f64991d).f122252a.getString("io.embrace.jsbundle.url", null);
                            String string2 = ((uh2.a) hVar.f64991d).f122252a.getString("io.embrace.jsbundle.id", null);
                            if (string != null && string.length() != 0 && string2 != null && string2.length() != 0) {
                                return string2;
                            }
                            return g3.E(hVar.f64989b, string, hVar.f64988a.f138999d);
                        default:
                            return hVar.f64988a.f138996a;
                    }
                }
            });
        }
        this.f64993f = c13;
    }
}
