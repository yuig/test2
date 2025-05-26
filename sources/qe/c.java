package qe;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f103612a;

    /* renamed from: b, reason: collision with root package name */
    public final List f103613b;

    /* renamed from: c, reason: collision with root package name */
    public final List f103614c;

    /* renamed from: d, reason: collision with root package name */
    public final String f103615d;

    public c(String eventName, b method, a type, String appVersion, ArrayList path, ArrayList parameters, String componentId, String pathType, String activityName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(pathType, "pathType");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.f103612a = eventName;
        this.f103613b = path;
        this.f103614c = parameters;
        this.f103615d = activityName;
    }
}
