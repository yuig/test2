package ha2;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final o5.c f68429a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f68430b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f68431c;

    /* renamed from: d, reason: collision with root package name */
    public int f68432d;

    /* renamed from: e, reason: collision with root package name */
    public Function1 f68433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, o5.c bidiFormatter) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bidiFormatter, "bidiFormatter");
        this.f68429a = bidiFormatter;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        this.f68430b = new ArrayList();
        this.f68431c = false;
        this.f68432d = 0;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final void a(ha2.c r21) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ha2.e.a(ha2.c):void");
    }
}
