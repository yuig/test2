package fj2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* loaded from: classes4.dex */
public final class c implements ti2.c {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f62261c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final zi2.a f62262a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f62263b;

    static {
        Logger.getLogger(c.class.getName());
        Pattern.compile("([A-Za-z]){1}([A-Za-z0-9\\_\\-\\./]){0,254}");
        ti2.b.f117761a.a().mo74build();
    }

    public c(zi2.a aVar, List list, gj2.a aVar2) {
        new ArrayList();
        this.f62262a = aVar;
        this.f62263b = (Map) list.stream().collect(Collectors.toMap(Function.identity(), new ek0.b(8)));
    }

    public final String toString() {
        return "SdkMeter{instrumentationScopeInfo=" + this.f62262a + "}";
    }
}
