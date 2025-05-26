package com.pinterest.common.reporting;

/* loaded from: classes5.dex */
public final class CrashReporting$InternalCrashReportingError extends RuntimeException {
    public CrashReporting$InternalCrashReportingError(Throwable th3, Throwable th4) {
        super("Internal error in Crash Reporting", th3.getCause() == null ? th3.initCause(th4) : th4);
    }
}
