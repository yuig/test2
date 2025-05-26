package com.google.android.engage.books.datamodel;

import android.net.Uri;
import bf.b;
import com.google.android.engage.common.datamodel.ContinuationEntity;
import com.google.android.engage.common.datamodel.Rating;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import java.util.List;

@KeepName
/* loaded from: classes3.dex */
public abstract class BookEntity extends ContinuationEntity {

    /* renamed from: h, reason: collision with root package name */
    public final Uri f30247h;

    /* renamed from: i, reason: collision with root package name */
    public final int f30248i;

    /* renamed from: j, reason: collision with root package name */
    public final Rating f30249j;

    /* renamed from: k, reason: collision with root package name */
    public final int f30250k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f30251l;

    /* renamed from: m, reason: collision with root package name */
    public final List f30252m;

    public BookEntity(int i13, ArrayList arrayList, String str, Long l13, Uri uri, int i14, Rating rating, int i15, boolean z13, ArrayList arrayList2) {
        super(i13, arrayList, str, l13);
        b.j("Action link Uri cannot be empty", uri != null);
        this.f30247h = uri;
        this.f30248i = i14;
        if (i14 > Integer.MIN_VALUE) {
            b.j("Progress percent should be >= 0 and < 100", i14 >= 0 && i14 < 100);
        }
        this.f30249j = rating;
        this.f30250k = i15;
        this.f30251l = z13;
        this.f30252m = arrayList2;
    }
}
