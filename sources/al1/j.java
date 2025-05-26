package al1;

import android.app.Activity;
import android.os.Parcelable;
import androidx.lifecycle.l1;
import bm1.t;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.navigation.Navigation;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nm1.b0;
import om1.p;

/* loaded from: classes5.dex */
public final class j extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15487i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f15488j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13, Function1 function1) {
        super(1);
        this.f15487i = i13;
        this.f15488j = function1;
    }

    public final void b(gm1.c event) {
        int i13 = this.f15487i;
        Function1 function1 = this.f15488j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xl1.b) {
                    function1.invoke(event);
                    break;
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof t) {
                    function1.invoke(event);
                    break;
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof p) {
                    function1.invoke(event);
                    break;
                }
                break;
            case 6:
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof rn1.i) {
                    function1.invoke(event);
                    break;
                }
                break;
            case 7:
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof on1.i) {
                    function1.invoke(event);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof rn1.i) {
                    function1.invoke(event);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nl1.d f34938d;
        int i13 = this.f15487i;
        Function1 function1 = this.f15488j;
        switch (i13) {
            case 0:
                Object activity = (Activity) obj;
                Intrinsics.checkNotNullParameter(activity, "activity");
                cp1.a aVar = activity instanceof cp1.a ? (cp1.a) activity : null;
                if (aVar != null && (f34938d = aVar.getF34938d()) != null) {
                    function1.invoke(f34938d);
                    r1 = Unit.f80348a;
                }
                if (r1 != null) {
                    return Unit.f80348a;
                }
                throw new IllegalStateException("No active fragment available - Activity: " + activity);
            case 1:
                ku1.k screenNavigator = (ku1.k) obj;
                Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
                screenNavigator.z(function1);
                return Unit.f80348a;
            case 2:
                ScreenDescription screenDescription = (ScreenDescription) obj;
                Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
                Parcelable parcelable = screenDescription.getF49207c().getParcelable("NAVIGATION_MODEL_BUNDLE_KEY");
                return parcelable instanceof Navigation ? (Boolean) function1.invoke(parcelable) : Boolean.FALSE;
            case 3:
                b((gm1.c) obj);
                return Unit.f80348a;
            case 4:
                b((gm1.c) obj);
                return Unit.f80348a;
            case 5:
                b((gm1.c) obj);
                return Unit.f80348a;
            case 6:
                b((gm1.c) obj);
                return Unit.f80348a;
            case 7:
                b((gm1.c) obj);
                return Unit.f80348a;
            case 8:
                b((gm1.c) obj);
                return Unit.f80348a;
            case 9:
                nm1.m state = (nm1.m) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                b0 b0Var = (b0) function1.invoke(state instanceof b0 ? (b0) state : null);
                return b0Var != null ? b0Var : state;
            case 10:
                ym1.c it = (ym1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return (ym1.c) function1.invoke(it);
            case 11:
                long j13 = ((a3.c) obj).f482a;
                function1.invoke(br1.j.f23797a);
                return Unit.f80348a;
            case 12:
                wy0 wy0Var = (wy0) obj;
                switch (i13) {
                    case 12:
                        if (wy0Var != null) {
                            function1.invoke(wy0Var);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.f(wy0Var);
                        function1.invoke(wy0Var);
                        break;
                }
                return Unit.f80348a;
            case 13:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                function1.invoke(th3);
                return Unit.f80348a;
            case 14:
                wy0 wy0Var2 = (wy0) obj;
                switch (i13) {
                    case 12:
                        if (wy0Var2 != null) {
                            function1.invoke(wy0Var2);
                            break;
                        }
                        break;
                    default:
                        Intrinsics.f(wy0Var2);
                        function1.invoke(wy0Var2);
                        break;
                }
                return Unit.f80348a;
            case 15:
                return (l1) function1.invoke(obj);
            case 16:
                File tempFile = (File) obj;
                Intrinsics.checkNotNullParameter(tempFile, "tempFile");
                OutputStream fileOutputStream = new FileOutputStream(tempFile);
                BufferedOutputStream bufferedOutputStream = fileOutputStream instanceof BufferedOutputStream ? (BufferedOutputStream) fileOutputStream : new BufferedOutputStream(fileOutputStream, 8192);
                try {
                    function1.invoke(bufferedOutputStream);
                    dl2.b.J(bufferedOutputStream, null);
                    return Unit.f80348a;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        dl2.b.J(bufferedOutputStream, th4);
                        throw th5;
                    }
                }
            case 17:
                OutputStream stream = (OutputStream) obj;
                Intrinsics.checkNotNullParameter(stream, "stream");
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(stream);
                try {
                    function1.invoke(gZIPOutputStream);
                    dl2.b.J(gZIPOutputStream, null);
                    return Unit.f80348a;
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        dl2.b.J(gZIPOutputStream, th6);
                        throw th7;
                    }
                }
            default:
                pn2.b0 b0Var2 = (pn2.b0) obj;
                Intrinsics.f(b0Var2);
                return function1.invoke(b0Var2).toString();
        }
    }
}
