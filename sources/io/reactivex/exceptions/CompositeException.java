package io.reactivex.exceptions;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import wd.i0;
import yj2.a;

/* loaded from: classes4.dex */
public final class CompositeException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final List f73312a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73313b;

    /* renamed from: c, reason: collision with root package name */
    public i0 f73314c;

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public static void a(StringBuilder sb3, Throwable th3, String str) {
        sb3.append(str);
        sb3.append(th3);
        sb3.append('\n');
        for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
            sb3.append("\t\tat ");
            sb3.append(stackTraceElement);
            sb3.append('\n');
        }
        if (th3.getCause() != null) {
            sb3.append("\tCaused by: ");
            a(sb3, th3.getCause(), "");
        }
    }

    public final void b(a aVar) {
        StringBuilder sb3 = new StringBuilder(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        sb3.append(this);
        sb3.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb3.append("\tat ");
            sb3.append(stackTraceElement);
            sb3.append('\n');
        }
        int i13 = 1;
        for (Throwable th3 : this.f73312a) {
            sb3.append("  ComposedException ");
            sb3.append(i13);
            sb3.append(" :\n");
            a(sb3, th3, "\t");
            i13++;
        }
        aVar.E0(sb3.toString());
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        try {
            if (this.f73314c == null) {
                i0 i0Var = new i0(2);
                HashSet hashSet = new HashSet();
                i0 i0Var2 = i0Var;
                for (Throwable th3 : this.f73312a) {
                    if (!hashSet.contains(th3)) {
                        hashSet.add(th3);
                        ArrayList arrayList = new ArrayList();
                        Throwable cause = th3.getCause();
                        if (cause != null && cause != th3) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Throwable th4 = (Throwable) it.next();
                            if (hashSet.contains(th4)) {
                                th3 = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th4);
                            }
                        }
                        try {
                            i0Var2.initCause(th3);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = i0Var2.getCause();
                        if (cause3 != null && i0Var2 != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                }
                                cause3 = cause4;
                            }
                            i0Var2 = cause3;
                        }
                    }
                }
                this.f73314c = i0Var;
            }
        } catch (Throwable th5) {
            throw th5;
        }
        return this.f73314c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f73313b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new a(printStream, 0));
    }

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th3 = (Throwable) it.next();
                if (th3 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th3).f73312a);
                } else if (th3 != null) {
                    linkedHashSet.add(th3);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            this.f73312a = unmodifiableList;
            this.f73313b = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new a(printWriter, 1));
    }
}
