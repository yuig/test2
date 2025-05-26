package com.google.android.engage.video.datamodel;

import com.google.android.engage.common.datamodel.ContinuationEntity;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;

@KeepName
/* loaded from: classes3.dex */
public abstract class VideoEntity extends ContinuationEntity {

    /* renamed from: h, reason: collision with root package name */
    public final int f30372h;

    /* renamed from: i, reason: collision with root package name */
    public final long f30373i;

    public VideoEntity(int i13, ArrayList arrayList, String str, Long l13, int i14, long j13) {
        super(i13, arrayList, str, l13);
        this.f30372h = i14;
        this.f30373i = j13;
    }
}
