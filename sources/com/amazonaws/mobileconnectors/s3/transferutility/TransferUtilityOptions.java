package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class TransferUtilityOptions implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final Log f28728d = LogFactory.a(TransferUtilityOptions.class);

    /* renamed from: a, reason: collision with root package name */
    public int f28729a = (Runtime.getRuntime().availableProcessors() + 1) * 2;

    /* renamed from: c, reason: collision with root package name */
    public final TransferNetworkConnectionType f28731c = TransferNetworkConnectionType.ANY;

    /* renamed from: b, reason: collision with root package name */
    public long f28730b = 5242880;
}
