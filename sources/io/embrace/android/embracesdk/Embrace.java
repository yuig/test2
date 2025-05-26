package io.embrace.android.embracesdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.ConsoleMessage;
import com.google.android.gms.ads.RequestConfiguration;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dg2.c;
import dg2.l;
import di2.j;
import ei2.k;
import ei2.n;
import io.embrace.android.embracesdk.internal.config.remote.NetworkSpanForwardingRemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.internal.payload.UserInfo;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kh2.j2;
import kh2.n0;
import kh2.s2;
import kh2.t0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.h1;
import kotlin.collections.i1;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kv0.p;
import lf2.b;
import lf2.i;
import org.jetbrains.annotations.NotNull;
import rf2.a;
import rl2.u;
import sf2.d;
import sf2.g;
import ui2.m;
import xk2.q;
import xk2.s;
import zf2.e;
import zf2.f;
import zf2.h;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ²\u00012\u00020\u0001:\u0002³\u0001B\u0017\b\u0002\u0012\n\b\u0002\u0010¡\u0001\u001a\u00030 \u0001¢\u0006\u0006\b±\u0001\u0010¦\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0005\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ'\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b \u0010\rJ\u000f\u0010!\u001a\u00020\u0004H\u0017¢\u0006\u0004\b!\u0010\u000fJ\u0011\u0010\"\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\rJ\u0017\u0010*\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010\rJ\u0017\u0010+\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010\rJ\u0017\u0010,\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\rJ\u001f\u0010/\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J5\u0010/\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\n2\u0006\u0010.\u001a\u00020-2\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u000101H\u0016¢\u0006\u0004\b/\u00103J=\u0010/\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\n2\u0006\u0010.\u001a\u00020-2\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001012\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b/\u00106JE\u0010/\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\n2\u0006\u0010.\u001a\u00020-2\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001012\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u00109J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b<\u0010>J5\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:2\u0006\u0010.\u001a\u00020-2\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u000101H\u0016¢\u0006\u0004\b<\u0010?J?\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:2\u0006\u0010.\u001a\u00020-2\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001012\b\u0010(\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b<\u0010@J\u001d\u0010D\u001a\u00020\u00042\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0AH\u0016¢\u0006\u0004\bD\u0010EJ%\u0010D\u001a\u00020\u00042\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\bD\u0010FJ;\u0010D\u001a\u00020\u00042\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A2\u0006\u0010.\u001a\u00020-2\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u000101H\u0016¢\u0006\u0004\bD\u0010GJE\u0010D\u001a\u00020\u00042\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A2\u0006\u0010.\u001a\u00020-2\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001012\b\u0010(\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\bD\u0010HJ\u000f\u0010I\u001a\u00020\u0004H\u0016¢\u0006\u0004\bI\u0010\u000fJ\u0017\u0010I\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0019H\u0016¢\u0006\u0004\bI\u0010KJ\u0017\u0010M\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bM\u0010\u001eJ\u0017\u0010N\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bN\u0010\u001eJ!\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010L\u001a\u00020\n2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bR\u0010SJ+\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010L\u001a\u00020\n2\b\u0010T\u001a\u0004\u0018\u00010Q2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bR\u0010UJ!\u0010V\u001a\u0004\u0018\u00010Q2\u0006\u0010L\u001a\u00020\n2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bV\u0010SJ+\u0010V\u001a\u0004\u0018\u00010Q2\u0006\u0010L\u001a\u00020\n2\b\u0010T\u001a\u0004\u0018\u00010Q2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bV\u0010UJ5\u0010V\u001a\u0004\u0018\u00010Q2\u0006\u0010L\u001a\u00020\n2\b\u0010T\u001a\u0004\u0018\u00010Q2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bV\u0010YJ3\u0010]\u001a\u00028\u0000\"\u0004\b\u0000\u0010Z2\u0006\u0010L\u001a\u00020\n2\u0006\u0010P\u001a\u00020O2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016¢\u0006\u0004\b]\u0010^J=\u0010]\u001a\u00028\u0000\"\u0004\b\u0000\u0010Z2\u0006\u0010L\u001a\u00020\n2\b\u0010T\u001a\u0004\u0018\u00010Q2\u0006\u0010P\u001a\u00020O2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016¢\u0006\u0004\b]\u0010_JY\u0010]\u001a\u00028\u0000\"\u0004\b\u0000\u0010Z2\u0006\u0010L\u001a\u00020\n2\u0014\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u0001012\u000e\u0010c\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010a2\u0006\u0010P\u001a\u00020O2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016¢\u0006\u0004\b]\u0010dJc\u0010]\u001a\u00028\u0000\"\u0004\b\u0000\u0010Z2\u0006\u0010L\u001a\u00020\n2\b\u0010T\u001a\u0004\u0018\u00010Q2\u0014\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u0001012\u000e\u0010c\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010a2\u0006\u0010P\u001a\u00020O2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016¢\u0006\u0004\b]\u0010eJa\u0010i\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\n2\u0006\u0010X\u001a\u00020W2\u0006\u0010f\u001a\u00020W2\b\u0010h\u001a\u0004\u0018\u00010g2\b\u0010T\u001a\u0004\u0018\u00010Q2\u0014\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u0001012\u000e\u0010c\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010aH\u0016¢\u0006\u0004\bi\u0010jJ'\u0010i\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\n2\u0006\u0010X\u001a\u00020W2\u0006\u0010f\u001a\u00020WH\u0016¢\u0006\u0004\bi\u0010kJ1\u0010i\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\n2\u0006\u0010X\u001a\u00020W2\u0006\u0010f\u001a\u00020W2\b\u0010h\u001a\u0004\u0018\u00010gH\u0016¢\u0006\u0004\bi\u0010lJ1\u0010i\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\n2\u0006\u0010X\u001a\u00020W2\u0006\u0010f\u001a\u00020W2\b\u0010T\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bi\u0010mJ;\u0010i\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\n2\u0006\u0010X\u001a\u00020W2\u0006\u0010f\u001a\u00020W2\b\u0010h\u001a\u0004\u0018\u00010g2\b\u0010T\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bi\u0010nJM\u0010i\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\n2\u0006\u0010X\u001a\u00020W2\u0006\u0010f\u001a\u00020W2\u0014\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u0001012\u000e\u0010c\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010aH\u0016¢\u0006\u0004\bi\u0010oJ\u0019\u0010q\u001a\u0004\u0018\u00010Q2\u0006\u0010p\u001a\u00020\nH\u0016¢\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001a\u00020\u00042\u0006\u0010t\u001a\u00020sH\u0016¢\u0006\u0004\bu\u0010vJ\u000f\u0010x\u001a\u00020wH\u0016¢\u0006\u0004\bx\u0010yJ\u0017\u0010|\u001a\u00020\u00042\u0006\u0010{\u001a\u00020zH\u0016¢\u0006\u0004\b|\u0010}Jj\u0010\u0087\u0001\u001a\u00020\u00042\b\u0010~\u001a\u0004\u0018\u00010\n2\b\u0010\u007f\u001a\u0004\u0018\u00010\n2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\n2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\n2\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00012\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0082\u00012\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00192\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J%\u0010\u008c\u0001\u001a\u00020\u00042\u0007\u0010\u0089\u0001\u001a\u00020\n2\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J#\u0010\u008c\u0001\u001a\u00020\u00042\u0007\u0010\u0089\u0001\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008e\u0001J\u0011\u0010\u008f\u0001\u001a\u00020\u0004H\u0016¢\u0006\u0005\b\u008f\u0001\u0010\u000fJ\u001c\u0010\u0091\u0001\u001a\u00020\u00042\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0005\b\u0091\u0001\u0010\rJ\u0011\u0010\u0092\u0001\u001a\u00020\u0004H\u0016¢\u0006\u0005\b\u0092\u0001\u0010\u000fJ\u001c\u0010\u0095\u0001\u001a\u00020\u00042\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0012\u0010\u0097\u0001\u001a\u00020WH\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J,\u0010\u0099\u0001\u001a\u00020\u00042\b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J`\u0010\u009b\u0001\u001a\u00020\u00042\b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\u0006\u0010L\u001a\u00020\n2\u0006\u0010X\u001a\u00020W2\u0006\u0010f\u001a\u00020W2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n012\f\u0010c\u001a\b\u0012\u0004\u0012\u00020b0a2\b\u0010h\u001a\u0004\u0018\u00010gH\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\"\u0010\u009d\u0001\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0006\b\u009d\u0001\u0010\u008e\u0001JV\u0010\u009e\u0001\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\n2\u0006\u0010X\u001a\u00020W2\u0006\u0010f\u001a\u00020W2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n012\f\u0010c\u001a\b\u0012\u0004\u0012\u00020b0a2\b\u0010h\u001a\u0004\u0018\u00010gH\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¡\u0001\u001a\u00030 \u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R\u0017\u0010§\u0001\u001a\u00020\u00198VX\u0096\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010ª\u0001\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010#R\u0018\u0010¬\u0001\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010#R\u0018\u0010°\u0001\u001a\u00030\u00ad\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001¨\u0006´\u0001"}, d2 = {"Lio/embrace/android/embracesdk/Embrace;", "", "Landroid/content/Context;", "context", "", "start", "(Landroid/content/Context;)V", "Llf2/a;", "appFramework", "(Landroid/content/Context;Llf2/a;)V", "", "userId", "setUserIdentifier", "(Ljava/lang/String;)V", "clearUserIdentifier", "()V", "email", "setUserEmail", "clearUserEmail", "persona", "addUserPersona", "clearUserPersona", "clearAllUserPersonas", "key", "value", "", "permanent", "addSessionProperty", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "removeSessionProperty", "(Ljava/lang/String;)Z", "username", "setUsername", "clearUsername", "generateW3cTraceparent", "()Ljava/lang/String;", "Lio/embrace/android/embracesdk/network/EmbraceNetworkRequest;", "networkRequest", "recordNetworkRequest", "(Lio/embrace/android/embracesdk/network/EmbraceNetworkRequest;)V", "message", "logInfo", "logWarning", "logError", "addBreadcrumb", "Lio/embrace/android/embracesdk/Severity;", "severity", "logMessage", "(Ljava/lang/String;Lio/embrace/android/embracesdk/Severity;)V", "", "properties", "(Ljava/lang/String;Lio/embrace/android/embracesdk/Severity;Ljava/util/Map;)V", "", "attachment", "(Ljava/lang/String;Lio/embrace/android/embracesdk/Severity;Ljava/util/Map;[B)V", "attachmentId", "attachmentUrl", "(Ljava/lang/String;Lio/embrace/android/embracesdk/Severity;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "logException", "(Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;Lio/embrace/android/embracesdk/Severity;)V", "(Ljava/lang/Throwable;Lio/embrace/android/embracesdk/Severity;Ljava/util/Map;)V", "(Ljava/lang/Throwable;Lio/embrace/android/embracesdk/Severity;Ljava/util/Map;Ljava/lang/String;)V", "", "Ljava/lang/StackTraceElement;", "stacktraceElements", "logCustomStacktrace", "([Ljava/lang/StackTraceElement;)V", "([Ljava/lang/StackTraceElement;Lio/embrace/android/embracesdk/Severity;)V", "([Ljava/lang/StackTraceElement;Lio/embrace/android/embracesdk/Severity;Ljava/util/Map;)V", "([Ljava/lang/StackTraceElement;Lio/embrace/android/embracesdk/Severity;Ljava/util/Map;Ljava/lang/String;)V", "endSession", "clearUserInfo", "(Z)V", "name", "startView", "endView", "Loi2/a;", "autoTerminationMode", "Loi2/b;", "createSpan", "(Ljava/lang/String;Loi2/a;)Loi2/b;", "parent", "(Ljava/lang/String;Loi2/b;Loi2/a;)Loi2/b;", "startSpan", "", "startTimeMs", "(Ljava/lang/String;Loi2/b;Ljava/lang/Long;Loi2/a;)Loi2/b;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "code", "recordSpan", "(Ljava/lang/String;Loi2/a;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Ljava/lang/String;Loi2/b;Loi2/a;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "attributes", "", "Loi2/c;", "events", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Loi2/a;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Ljava/lang/String;Loi2/b;Ljava/util/Map;Ljava/util/List;Loi2/a;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "endTimeMs", "Lio/embrace/android/embracesdk/spans/ErrorCode;", "errorCode", "recordCompletedSpan", "(Ljava/lang/String;JJLio/embrace/android/embracesdk/spans/ErrorCode;Loi2/b;Ljava/util/Map;Ljava/util/List;)Z", "(Ljava/lang/String;JJ)Z", "(Ljava/lang/String;JJLio/embrace/android/embracesdk/spans/ErrorCode;)Z", "(Ljava/lang/String;JJLoi2/b;)Z", "(Ljava/lang/String;JJLio/embrace/android/embracesdk/spans/ErrorCode;Loi2/b;)Z", "(Ljava/lang/String;JJLjava/util/Map;Ljava/util/List;)Z", "spanId", "getSpan", "(Ljava/lang/String;)Loi2/b;", "Lpj2/c;", "spanExporter", "addSpanExporter", "(Lpj2/c;)V", "Lpi2/b;", "getOpenTelemetry", "()Lpi2/b;", "Ldj2/a;", "logRecordExporter", "addLogRecordExporter", "(Ldj2/a;)V", "title", "body", "topic", "id", "", "notificationPriority", "messageDeliveredPriority", "isNotification", "hasData", "logPushNotification", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "tag", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "trackWebViewPerformance", "(Ljava/lang/String;Landroid/webkit/ConsoleMessage;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "applicationInitEnd", "url", "logWebView", "disable", "Landroid/app/Activity;", "activity", "activityLoaded", "(Landroid/app/Activity;)V", "getSdkCurrentTimeMs", "()J", "addLoadTraceAttribute", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "addLoadTraceChildSpan", "(Landroid/app/Activity;Ljava/lang/String;JJLjava/util/Map;Ljava/util/List;Lio/embrace/android/embracesdk/spans/ErrorCode;)V", "addStartupTraceAttribute", "addStartupTraceChildSpan", "(Ljava/lang/String;JJLjava/util/Map;Ljava/util/List;Lio/embrace/android/embracesdk/spans/ErrorCode;)V", "Llf2/i;", "impl", "Llf2/i;", "getImpl$embrace_android_sdk_release", "()Llf2/i;", "setImpl$embrace_android_sdk_release", "(Llf2/i;)V", "isStarted", "()Z", "getDeviceId", "deviceId", "getCurrentSessionId", "currentSessionId", "Llf2/j;", "getLastRunEndState", "()Llf2/j;", "lastRunEndState", "<init>", "Companion", "lf2/b", "embrace-android-sdk_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"EmbracePublicApiPackageRule"})
/* loaded from: classes4.dex */
public final class Embrace implements a {

    @NotNull
    public static final b Companion = new b();

    @NotNull
    private static final Embrace instance = new Embrace(null, 1, null);

    @NotNull
    private i impl;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ Embrace(lf2.i r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L19
            java.lang.String r1 = "embrace-impl-init"
            c0.d.M2(r1)     // Catch: java.lang.Throwable -> L12
            lf2.i r1 = new lf2.i     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            c0.d.N()
            goto L19
        L12:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L14
        L14:
            r1 = move-exception
            c0.d.N()
            throw r1
        L19:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.Embrace.<init>(lf2.i, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public static final Embrace getInstance() {
        Companion.getClass();
        return instance;
    }

    public void activityLoaded(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        d dVar = iVar.f83161l;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (dVar.f112814a.e("activity_fully_loaded")) {
            e eVar = (e) dVar.f112816c.a(dVar, d.f112813e[0]);
            if (eVar != null) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                int hashCode = activity.hashCode();
                long now = dVar.f112815b.now();
                zf2.i iVar2 = (zf2.i) eVar;
                if (iVar2.e(hashCode) == f.MANUAL) {
                    iVar2.b(hashCode, now, null);
                }
            }
        }
    }

    public void addBreadcrumb(@NotNull String message) {
        c cVar;
        Intrinsics.checkNotNullParameter(message, "message");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        sf2.b bVar = iVar.f83159j;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        if (bVar.f112808a.e("add_breadcrumb")) {
            u[] uVarArr = sf2.b.f112807e;
            uf2.d dVar = (uf2.d) bVar.f112810c.a(bVar, uVarArr[0]);
            if (dVar != null && (cVar = (c) dVar.f122121f) != null) {
                long now = bVar.f112809b.now();
                Intrinsics.checkNotNullParameter(message, "message");
                cVar.e(new s60.a(message, 4), new i1.u(cVar, message, now, 2));
            }
            di2.c cVar2 = (di2.c) bVar.f112811d.a(bVar, uVarArr[1]);
            if (cVar2 != null) {
                ((j) cVar2).a();
            }
        }
    }

    public void addLoadTraceAttribute(@NotNull Activity activity, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        d dVar = iVar.f83161l;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (dVar.f112814a.e("add_load_trace_attribute")) {
            e eVar = (e) dVar.f112816c.a(dVar, d.f112813e[0]);
            if (eVar != null) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                int hashCode = activity.hashCode();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                h hVar = (h) ((zf2.i) eVar).f141947b.get(Integer.valueOf(hashCode));
                if (hVar != null) {
                    ((k) hVar.f141944c).j(key, value);
                }
            }
        }
    }

    public void addLoadTraceChildSpan(@NotNull Activity activity, @NotNull String name, long j13, long j14) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        addLoadTraceChildSpan(activity, name, j13, j14, z0.d(), q0.f80391a, null);
    }

    public void addLogRecordExporter(@NotNull dj2.a logRecordExporter) {
        Intrinsics.checkNotNullParameter(logRecordExporter, "logRecordExporter");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(logRecordExporter, "logRecordExporter");
        g01.a aVar = iVar.f83158i;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(logRecordExporter, "logRecordExporter");
        if (((AtomicBoolean) ((p) aVar.f63225b).f80996c).get()) {
            return;
        }
        sh2.j c13 = ((s2) ((j2) aVar.f63224a).f79551c).c();
        c13.getClass();
        Intrinsics.checkNotNullParameter(logRecordExporter, "logExporter");
        c13.f112980e.add(logRecordExporter);
    }

    public boolean addSessionProperty(@NotNull String key, @NotNull String value, boolean permanent) {
        Boolean bool;
        boolean z13;
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        sf2.j jVar = iVar.f83153d;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!jVar.f112845a.e("add_session_property")) {
            return false;
        }
        u[] uVarArr = sf2.j.f112844d;
        ig2.b bVar = (ig2.b) jVar.f112846b.a(jVar, uVarArr[0]);
        if (bVar != null) {
            ig2.c cVar = (ig2.c) bVar;
            Intrinsics.checkNotNullParameter(key, "originalKey");
            Intrinsics.checkNotNullParameter(value, "originalValue");
            if (!(key == null || key.length() == 0)) {
                String sanitizedKey = ig2.c.a(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, key);
                if (value != null) {
                    String sanitizedValue = ((sg2.b) cVar.f72249a).f112879d.a(sanitizedKey) ? "<redacted>" : ig2.c.a(1024, value);
                    ig2.a aVar = cVar.f72250b;
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(sanitizedKey, "sanitizedKey");
                    Intrinsics.checkNotNullParameter(sanitizedValue, "sanitizedValue");
                    synchronized (aVar.f72247e) {
                        try {
                            RemoteConfig remoteConfig = ((sg2.b) aVar.f72244b).f112882g.f117625a;
                            int intValue = (remoteConfig == null || (num = remoteConfig.f73060o) == null) ? 10 : num.intValue();
                            if (aVar.f72246d.size() + aVar.b().size() <= intValue) {
                                if (aVar.f72246d.size() + aVar.b().size() != intValue || aVar.b().containsKey(sanitizedKey) || aVar.f72246d.containsKey(sanitizedKey)) {
                                    if (permanent) {
                                        aVar.b().put(sanitizedKey, sanitizedValue);
                                        aVar.f72246d.remove(sanitizedKey);
                                        ((uh2.a) aVar.f72243a).c(aVar.b());
                                    } else {
                                        Map b13 = aVar.b();
                                        if (b13.remove(sanitizedKey) != null) {
                                            aVar.f72247e.set(b13);
                                            ((uh2.a) aVar.f72243a).c(aVar.b());
                                        }
                                        aVar.f72246d.put(sanitizedKey, sanitizedValue);
                                    }
                                    ((ei2.a) aVar.f72245c).j(new vf2.d(ig1.b.m1(sanitizedKey), sanitizedValue));
                                    z13 = true;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    bool = Boolean.valueOf(z13);
                }
            }
            z13 = false;
            bool = Boolean.valueOf(z13);
        } else {
            bool = null;
        }
        di2.c cVar2 = (di2.c) jVar.f112847c.a(jVar, uVarArr[1]);
        if (cVar2 != null) {
            ((j) cVar2).a();
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public void addSpanExporter(@NotNull pj2.c spanExporter) {
        Intrinsics.checkNotNullParameter(spanExporter, "spanExporter");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(spanExporter, "spanExporter");
        g01.a aVar = iVar.f83158i;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(spanExporter, "spanExporter");
        if (((AtomicBoolean) ((p) aVar.f63225b).f80996c).get()) {
            return;
        }
        sh2.j c13 = ((s2) ((j2) aVar.f63224a).f79551c).c();
        c13.getClass();
        Intrinsics.checkNotNullParameter(spanExporter, "spanExporter");
        c13.f112979d.add(spanExporter);
    }

    public void addStartupTraceAttribute(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        d dVar = iVar.f83161l;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (dVar.f112814a.e("add_startup_trace_attribute")) {
            jg2.a aVar = (jg2.a) dVar.f112817d.a(dVar, d.f112813e[1]);
            if (aVar != null) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                ((jg2.c) aVar).f76101j.put(key, value);
            }
        }
    }

    public void addStartupTraceChildSpan(@NotNull String name, long j13, long j14) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(name, "name");
        addStartupTraceChildSpan(name, j13, j14, z0.d(), q0.f80391a, null);
    }

    public void addUserPersona(@NotNull String persona) {
        mg2.b a13;
        Intrinsics.checkNotNullParameter(persona, "persona");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(persona, "persona");
        sf2.k kVar = iVar.f83152c;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(persona, "persona");
        if (!kVar.f112849a.e("add_user_persona") || (a13 = kVar.a()) == null) {
            return;
        }
        mg2.a aVar = (mg2.a) a13;
        if (persona != null && mg2.a.f87149e.matcher(persona).matches()) {
            Set set = aVar.f().f73279d;
            if (set == null || (set.size() < 10 && !set.contains(persona))) {
                Set set2 = aVar.f().f73279d;
                Set<String> j13 = set2 != null ? i1.j(set2, persona) : h1.d(persona);
                aVar.b(UserInfo.a(aVar.f(), null, null, null, j13, 7));
                SharedPreferences.Editor edit = ((uh2.a) aVar.f87151a).f122252a.edit();
                edit.putStringSet("io.embrace.userpersonas", j13);
                edit.apply();
            }
        }
    }

    public void applicationInitEnd() {
        d dVar = this.impl.f83161l;
        if (dVar.f112814a.e("application_init_end")) {
            jg2.a aVar = (jg2.a) dVar.f112817d.a(dVar, d.f112813e[1]);
            if (aVar != null) {
                jg2.c cVar = (jg2.c) aVar;
                cVar.f76102k = Long.valueOf(cVar.c());
            }
        }
    }

    public void clearAllUserPersonas() {
        mg2.b a13;
        sf2.k kVar = this.impl.f83152c;
        if (!kVar.f112849a.e("clear_user_personas") || (a13 = kVar.a()) == null) {
            return;
        }
        ((mg2.a) a13).a();
    }

    @xk2.d
    public void clearUserEmail() {
        mg2.b a13;
        sf2.k kVar = this.impl.f83152c;
        if (!kVar.f112849a.e("clear_user_email") || (a13 = kVar.a()) == null) {
            return;
        }
        ((mg2.a) a13).c(null);
    }

    public void clearUserIdentifier() {
        mg2.b a13;
        sf2.k kVar = this.impl.f83152c;
        if (!kVar.f112849a.e("clear_user_identifier") || (a13 = kVar.a()) == null) {
            return;
        }
        ((mg2.a) a13).d(null);
    }

    public void clearUserPersona(@NotNull String persona) {
        mg2.b a13;
        Intrinsics.checkNotNullParameter(persona, "persona");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(persona, "persona");
        sf2.k kVar = iVar.f83152c;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(persona, "persona");
        if (!kVar.f112849a.e("clear_user_persona") || (a13 = kVar.a()) == null) {
            return;
        }
        mg2.a aVar = (mg2.a) a13;
        if (persona == null) {
            return;
        }
        Set set = aVar.f().f73279d;
        if (set == null || set.contains(persona)) {
            Set set2 = aVar.f().f73279d;
            LinkedHashSet g13 = set2 != null ? i1.g(set2, persona) : new LinkedHashSet();
            aVar.b(UserInfo.a(aVar.f(), null, null, null, g13, 7));
            SharedPreferences.Editor edit = ((uh2.a) aVar.f87151a).f122252a.edit();
            edit.putStringSet("io.embrace.userpersonas", g13);
            edit.apply();
        }
    }

    @xk2.d
    public void clearUsername() {
        mg2.b a13;
        sf2.k kVar = this.impl.f83152c;
        if (!kVar.f112849a.e("clear_username") || (a13 = kVar.a()) == null) {
            return;
        }
        ((mg2.a) a13).e(null);
    }

    public oi2.b createSpan(@NotNull String name, @NotNull oi2.a autoTerminationMode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        n nVar = iVar.f83162m;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        return nVar.f59025a.c(xf2.c.f134850d, autoTerminationMode, null, name, false, false);
    }

    public void disable() {
        i iVar = this.impl;
        if (((AtomicBoolean) iVar.f83151b.f80996c).get()) {
            ((s2) iVar.f83150a.f79551c).c().f112981f = false;
            iVar.j();
        }
        try {
            q qVar = s.f135225b;
            Executors.newSingleThreadExecutor().execute(new lf2.d(iVar, 1));
            Unit unit = Unit.f80348a;
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            ue.c.m(th3);
        }
    }

    public void endSession() {
        this.impl.f83153d.a(false);
    }

    public boolean endView(@NotNull String name) {
        t0 a13;
        l lVar;
        Intrinsics.checkNotNullParameter(name, "name");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        sf2.l lVar2 = iVar.f83156g;
        lVar2.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        int i13 = 0;
        if (!lVar2.f112852a.e("end_view") || (a13 = lVar2.a()) == null) {
            return false;
        }
        uf2.d b13 = ((kh2.z0) a13).f79768d.b(kh2.z0.f79764n[2]);
        if (b13 == null || (lVar = (l) b13.f122121f) == null) {
            return false;
        }
        return lVar.g(new s60.a(name, 6), new dg2.k(lVar, name, i13), false);
    }

    public String generateW3cTraceparent() {
        tg2.n nVar;
        Float f13;
        sf2.h hVar = this.impl.f83154e;
        hVar.getClass();
        sg2.a aVar = (sg2.a) hVar.f112836b.a(hVar, sf2.h.f112834e[0]);
        if (aVar != null && (nVar = ((sg2.b) aVar).f112888m) != null) {
            NetworkSpanForwardingRemoteConfig networkSpanForwardingRemoteConfig = nVar.f117620c;
            if ((networkSpanForwardingRemoteConfig == null || (f13 = networkSpanForwardingRemoteConfig.f73042a) == null) ? nVar.f117619b.isNetworkSpanForwardingEnabled() : nVar.f117618a.b(f13.floatValue())) {
                nf2.i iVar = nf2.i.f90502c;
                return "00-" + m.c(iVar.a(), iVar.a()) + '-' + pp2.a.q(iVar.a()) + "-01";
            }
        }
        return null;
    }

    public String getCurrentSessionId() {
        String a13;
        sf2.i iVar = this.impl.f83157h;
        ai2.b bVar = (ai2.b) iVar.f112841b.a(iVar, sf2.i.f112839e[0]);
        if (bVar == null || !iVar.f112840a.e("get_current_session_id") || (a13 = ((ai2.c) bVar).a()) == null) {
            return null;
        }
        return a13;
    }

    @NotNull
    public String getDeviceId() {
        sf2.i iVar = this.impl.f83157h;
        if (!iVar.f112840a.e("get_device_id")) {
            return "";
        }
        uh2.b bVar = (uh2.b) iVar.f112842c.a(iVar, sf2.i.f112839e[1]);
        return bVar != null ? ((uh2.a) bVar).a() : "";
    }

    @NotNull
    /* renamed from: getImpl$embrace_android_sdk_release, reason: from getter */
    public final i getImpl() {
        return this.impl;
    }

    @NotNull
    public lf2.j getLastRunEndState() {
        boolean booleanValue;
        sf2.i iVar = this.impl.f83157h;
        if (iVar.a()) {
            u[] uVarArr = sf2.i.f112839e;
            u uVar = uVarArr[2];
            n0 n0Var = iVar.f112843d;
            if (((xg2.c) n0Var.a(iVar, uVar)) != null) {
                xg2.c cVar = (xg2.c) n0Var.a(iVar, uVarArr[2]);
                if (cVar != null) {
                    Boolean bool = cVar.f134957c;
                    if (bool != null) {
                        booleanValue = bool.booleanValue();
                    } else {
                        Future future = cVar.f134956b;
                        Boolean bool2 = null;
                        if (future != null) {
                            try {
                                bool2 = (Boolean) future.get(2L, TimeUnit.SECONDS);
                            } catch (Throwable unused) {
                            }
                        }
                        booleanValue = bool2 != null ? bool2.booleanValue() : cVar.a();
                    }
                    if (booleanValue) {
                        return lf2.j.CRASH;
                    }
                }
                return lf2.j.CLEAN_EXIT;
            }
        }
        return lf2.j.INVALID;
    }

    @NotNull
    public pi2.b getOpenTelemetry() {
        g01.a aVar = this.impl.f83158i;
        if (((AtomicBoolean) ((p) aVar.f63225b).f80996c).get()) {
            return (pi2.b) ((s2) ((j2) aVar.f63224a).f79551c).f79702p.getValue();
        }
        pi2.a aVar2 = pi2.a.f100209a;
        Intrinsics.checkNotNullExpressionValue(aVar2, "{\n            OpenTelemetry.noop()\n        }");
        return aVar2;
    }

    public long getSdkCurrentTimeMs() {
        return this.impl.f83161l.f112815b.now();
    }

    public oi2.b getSpan(@NotNull String spanId) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        n nVar = iVar.f83162m;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        return nVar.f59025a.f(spanId);
    }

    public boolean isStarted() {
        return this.impl.f83157h.a();
    }

    public void logCustomStacktrace(@NotNull StackTraceElement[] stacktraceElements) {
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        g gVar = iVar.f83155f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Severity severity = Severity.ERROR;
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Intrinsics.checkNotNullParameter(severity, "severity");
        g.d(gVar, severity, "", null, stacktraceElements, null, LogExceptionType.HANDLED, null, null, null, null, 848);
    }

    public void logError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        g gVar = iVar.f83155f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        gVar.c(message, Severity.ERROR);
    }

    public void logException(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        g gVar = iVar.f83155f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Severity severity = Severity.ERROR;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(severity, "severity");
        gVar.b(throwable, severity, null, null);
    }

    public void logInfo(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        g gVar = iVar.f83155f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        gVar.c(message, Severity.INFO);
    }

    public void logMessage(@NotNull String message, @NotNull Severity severity) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        iVar.f83155f.c(message, severity);
    }

    public void logPushNotification(String title, String body, String topic, String id3, Integer notificationPriority, Integer messageDeliveredPriority, Boolean isNotification, Boolean hasData) {
        g gVar = this.impl.f83155f;
        if (!gVar.f112827a.e("log_push_notification") || hasData == null || isNotification == null || messageDeliveredPriority == null) {
            return;
        }
        th2.k kVar = th2.l.Builder;
        boolean booleanValue = hasData.booleanValue();
        boolean booleanValue2 = isNotification.booleanValue();
        kVar.getClass();
        th2.l type = (booleanValue && booleanValue2) ? th2.l.NOTIFICATION_AND_DATA : (!booleanValue || booleanValue2) ? (booleanValue || !booleanValue2) ? th2.l.UNKNOWN : th2.l.NOTIFICATION : th2.l.DATA;
        u[] uVarArr = g.f112826h;
        dg2.e eVar = (dg2.e) gVar.f112830d.a(gVar, uVarArr[2]);
        if (eVar != null) {
            Intrinsics.checkNotNullParameter(type, "type");
            eVar.e(uf2.c.f122114k, new tc0.u(eVar, title, type, body, id3, topic, notificationPriority));
        }
        di2.c cVar = (di2.c) gVar.f112829c.a(gVar, uVarArr[1]);
        if (cVar != null) {
            ((j) cVar).a();
        }
    }

    public void logWarning(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        g gVar = iVar.f83155f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        gVar.c(message, Severity.WARNING);
    }

    public void logWebView(String url) {
        sf2.e eVar = this.impl.f83160k;
        if (eVar.f112819a.e("log_web_view")) {
            u[] uVarArr = sf2.e.f112818g;
            u uVar = uVarArr[0];
            n0 n0Var = eVar.f112821c;
            dg2.m mVar = (dg2.m) n0Var.a(eVar, uVarArr[0]);
            if (mVar != null) {
                long now = eVar.f112820b.now();
                try {
                    q qVar = s.f135225b;
                    mVar.e(new s60.a(url, 8), new i1.u(url, mVar, now, 3));
                } catch (Throwable th3) {
                    q qVar2 = s.f135225b;
                    ue.c.m(th3);
                }
            }
            di2.c cVar = (di2.c) eVar.f112824f.a(eVar, sf2.e.f112818g[3]);
            if (cVar != null) {
                ((j) cVar).a();
            }
        }
    }

    public boolean recordCompletedSpan(@NotNull String name, long startTimeMs, long endTimeMs, ErrorCode errorCode, oi2.b parent) {
        Intrinsics.checkNotNullParameter(name, "name");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        n nVar = iVar.f83162m;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        return nVar.a(name, startTimeMs, endTimeMs, errorCode, parent, null, null);
    }

    public void recordNetworkRequest(@NotNull EmbraceNetworkRequest networkRequest) {
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        this.impl.e(networkRequest);
    }

    public <T> T recordSpan(@NotNull String name, Map<String, String> attributes, List<oi2.c> events, @NotNull oi2.a autoTerminationMode, @NotNull Function0<? extends T> code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(code, "code");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(code, "code");
        n nVar = iVar.f83162m;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(code, "code");
        return (T) nVar.b(name, null, attributes, events, autoTerminationMode, code);
    }

    public boolean removeSessionProperty(@NotNull String key) {
        Boolean bool;
        boolean z13;
        Intrinsics.checkNotNullParameter(key, "key");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        sf2.j jVar = iVar.f83153d;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        if (!jVar.f112845a.e("remove_session_property")) {
            return false;
        }
        u[] uVarArr = sf2.j.f112844d;
        ig2.b bVar = (ig2.b) jVar.f112846b.a(jVar, uVarArr[0]);
        if (bVar != null) {
            ig2.c cVar = (ig2.c) bVar;
            Intrinsics.checkNotNullParameter(key, "originalKey");
            if (!(key == null || key.length() == 0)) {
                String sanitizedKey = ig2.c.a(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, key);
                ig2.a aVar = cVar.f72250b;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(sanitizedKey, "sanitizedKey");
                synchronized (aVar.f72247e) {
                    try {
                        z13 = aVar.f72246d.remove(sanitizedKey) != null;
                        Map b13 = aVar.b();
                        if (b13.remove(sanitizedKey) != null) {
                            aVar.f72247e.set(b13);
                            ((uh2.a) aVar.f72243a).c(aVar.b());
                            z13 = true;
                        }
                        vf2.c cVar2 = aVar.f72245c;
                        String key2 = ig1.b.m1(sanitizedKey);
                        ei2.a aVar2 = (ei2.a) cVar2;
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(key2, "key");
                        ei2.q qVar = (ei2.q) aVar2.f58966i.get();
                        if (qVar != null) {
                            k kVar = (k) qVar;
                            Intrinsics.checkNotNullParameter(key2, "key");
                            kVar.f59011m.remove(key2);
                            kVar.f59001c.d();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else {
                z13 = false;
            }
            bool = Boolean.valueOf(z13);
        } else {
            bool = null;
        }
        di2.c cVar3 = (di2.c) jVar.f112847c.a(jVar, uVarArr[1]);
        if (cVar3 != null) {
            ((j) cVar3).a();
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void setImpl$embrace_android_sdk_release(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.impl = iVar;
    }

    @xk2.d
    public void setUserEmail(String email) {
        mg2.b a13;
        sf2.k kVar = this.impl.f83152c;
        if (!kVar.f112849a.e("set_user_email") || (a13 = kVar.a()) == null) {
            return;
        }
        ((mg2.a) a13).c(email);
    }

    public void setUserIdentifier(String userId) {
        mg2.b a13;
        sf2.k kVar = this.impl.f83152c;
        if (!kVar.f112849a.e("set_user_identifier") || (a13 = kVar.a()) == null) {
            return;
        }
        ((mg2.a) a13).d(userId);
    }

    @xk2.d
    public void setUsername(String username) {
        mg2.b a13;
        sf2.k kVar = this.impl.f83152c;
        if (!kVar.f112849a.e("set_username") || (a13 = kVar.a()) == null) {
            return;
        }
        ((mg2.a) a13).e(username);
    }

    @xk2.d
    public void start(@NotNull Context context, @NotNull lf2.a appFramework) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appFramework, "appFramework");
        this.impl.g(context, appFramework);
    }

    public oi2.b startSpan(@NotNull String name, @NotNull oi2.a autoTerminationMode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        n nVar = iVar.f83162m;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        return nVar.c(name, null, null, autoTerminationMode);
    }

    public boolean startView(@NotNull String name) {
        t0 a13;
        l lVar;
        Intrinsics.checkNotNullParameter(name, "name");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        sf2.l lVar2 = iVar.f83156g;
        lVar2.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        if (!lVar2.f112852a.e("start_view") || (a13 = lVar2.a()) == null) {
            return false;
        }
        uf2.d b13 = ((kh2.z0) a13).f79768d.b(kh2.z0.f79764n[2]);
        if (b13 == null || (lVar = (l) b13.f122121f) == null) {
            return false;
        }
        return lVar.g(new s60.a(name, 7), new dg2.k(lVar, name, 1), true);
    }

    public void trackWebViewPerformance(@NotNull String tag, @NotNull ConsoleMessage consoleMessage) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(consoleMessage, "consoleMessage");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(consoleMessage, "consoleMessage");
        sf2.e eVar = iVar.f83160k;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(consoleMessage, "consoleMessage");
        String message = consoleMessage.message();
        if (message != null) {
            eVar.a(tag, message);
        }
    }

    public void logMessage(@NotNull String message, @NotNull Severity severity, Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        this.impl.b(message, severity, properties);
    }

    public void start(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        iVar.g(context, lf2.a.NATIVE);
    }

    public void endSession(boolean clearUserInfo) {
        this.impl.f83153d.a(clearUserInfo);
    }

    public void logMessage(@NotNull String message, @NotNull Severity severity, Map<String, ? extends Object> properties, @NotNull byte[] attachment) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        g gVar = iVar.f83155f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        nh2.e eVar = (nh2.e) gVar.f112832f.a(gVar, g.f112826h[4]);
        if (eVar != null) {
            Intrinsics.checkNotNullParameter(attachment, "attachment");
            nh2.a aVar = new nh2.a(attachment, new nh2.d(eVar, 0));
            gVar.a(aVar);
            g.d(gVar, severity, message, properties, null, null, null, null, null, null, aVar, 504);
        }
    }

    @Override // rf2.a
    public void addLoadTraceChildSpan(@NotNull Activity activity, @NotNull String name, long startTimeMs, long endTimeMs, @NotNull Map<String, String> attributes, @NotNull List<oi2.c> events, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(events, "events");
        this.impl.addLoadTraceChildSpan(activity, name, startTimeMs, endTimeMs, attributes, events, errorCode);
    }

    @Override // rf2.a
    public void addStartupTraceChildSpan(@NotNull String name, long startTimeMs, long endTimeMs, @NotNull Map<String, String> attributes, @NotNull List<oi2.c> events, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(events, "events");
        this.impl.addStartupTraceChildSpan(name, startTimeMs, endTimeMs, attributes, events, errorCode);
    }

    public boolean recordCompletedSpan(@NotNull String name, long startTimeMs, long endTimeMs, ErrorCode errorCode, oi2.b parent, Map<String, String> attributes, List<oi2.c> events) {
        Intrinsics.checkNotNullParameter(name, "name");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        return iVar.f83162m.a(name, startTimeMs, endTimeMs, errorCode, parent, attributes, events);
    }

    public <T> T recordSpan(@NotNull String name, @NotNull oi2.a autoTerminationMode, @NotNull Function0<? extends T> code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(code, "code");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(code, "code");
        n nVar = iVar.f83162m;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(code, "code");
        return (T) nVar.b(name, null, null, null, autoTerminationMode, code);
    }

    public void trackWebViewPerformance(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        iVar.f83160k.a(tag, message);
    }

    public oi2.b startSpan(@NotNull String name, oi2.b parent, Long startTimeMs, @NotNull oi2.a autoTerminationMode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        return this.impl.i(name, parent, startTimeMs, autoTerminationMode);
    }

    public oi2.b createSpan(@NotNull String name, oi2.b parent, @NotNull oi2.a autoTerminationMode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        n nVar = iVar.f83162m;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        return nVar.f59025a.c(xf2.c.f134850d, autoTerminationMode, parent, name, false, false);
    }

    public void logException(@NotNull Throwable throwable, @NotNull Severity severity) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(severity, "severity");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(severity, "severity");
        g gVar = iVar.f83155f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(severity, "severity");
        gVar.b(throwable, severity, null, null);
    }

    private Embrace(i iVar) {
        this.impl = iVar;
    }

    public boolean recordCompletedSpan(@NotNull String name, long startTimeMs, long endTimeMs, oi2.b parent) {
        Intrinsics.checkNotNullParameter(name, "name");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        n nVar = iVar.f83162m;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        return nVar.a(name, startTimeMs, endTimeMs, null, parent, null, null);
    }

    public oi2.b startSpan(@NotNull String name, oi2.b parent, @NotNull oi2.a autoTerminationMode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        n nVar = iVar.f83162m;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        return nVar.c(name, parent, null, autoTerminationMode);
    }

    public void logCustomStacktrace(@NotNull StackTraceElement[] stacktraceElements, @NotNull Severity severity) {
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Intrinsics.checkNotNullParameter(severity, "severity");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Intrinsics.checkNotNullParameter(severity, "severity");
        g gVar = iVar.f83155f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Intrinsics.checkNotNullParameter(severity, "severity");
        g.d(gVar, severity, "", null, stacktraceElements, null, LogExceptionType.HANDLED, null, null, null, null, 848);
    }

    public <T> T recordSpan(@NotNull String name, oi2.b parent, Map<String, String> attributes, List<oi2.c> events, @NotNull oi2.a autoTerminationMode, @NotNull Function0<? extends T> code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(code, "code");
        return (T) this.impl.f(name, parent, attributes, events, autoTerminationMode, code);
    }

    public void logException(@NotNull Throwable throwable, @NotNull Severity severity, Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(severity, "severity");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(severity, "severity");
        g gVar = iVar.f83155f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(severity, "severity");
        gVar.b(throwable, severity, properties, null);
    }

    public void logMessage(@NotNull String message, @NotNull Severity severity, Map<String, ? extends Object> properties, @NotNull String attachmentId, @NotNull String attachmentUrl) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
        Intrinsics.checkNotNullParameter(attachmentUrl, "attachmentUrl");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
        Intrinsics.checkNotNullParameter(attachmentUrl, "attachmentUrl");
        g gVar = iVar.f83155f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
        Intrinsics.checkNotNullParameter(attachmentUrl, "attachmentUrl");
        nh2.e eVar = (nh2.e) gVar.f112832f.a(gVar, g.f112826h[4]);
        if (eVar != null) {
            Intrinsics.checkNotNullParameter(attachmentId, "attachmentId");
            Intrinsics.checkNotNullParameter(attachmentUrl, "attachmentUrl");
            nh2.b bVar = new nh2.b(attachmentId, attachmentUrl, new nh2.d(eVar, 1));
            gVar.a(bVar);
            g.d(gVar, severity, message, properties, null, null, null, null, null, null, bVar, 504);
        }
    }

    public <T> T recordSpan(@NotNull String name, oi2.b parent, @NotNull oi2.a autoTerminationMode, @NotNull Function0<? extends T> code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(code, "code");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(code, "code");
        n nVar = iVar.f83162m;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        Intrinsics.checkNotNullParameter(code, "code");
        return (T) nVar.b(name, parent, null, null, autoTerminationMode, code);
    }

    public boolean recordCompletedSpan(@NotNull String name, long startTimeMs, long endTimeMs) {
        Intrinsics.checkNotNullParameter(name, "name");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        n nVar = iVar.f83162m;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        return nVar.a(name, startTimeMs, endTimeMs, null, null, null, null);
    }

    public void logCustomStacktrace(@NotNull StackTraceElement[] stacktraceElements, @NotNull Severity severity, Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Intrinsics.checkNotNullParameter(severity, "severity");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Intrinsics.checkNotNullParameter(severity, "severity");
        g gVar = iVar.f83155f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Intrinsics.checkNotNullParameter(severity, "severity");
        g.d(gVar, severity, "", properties, stacktraceElements, null, LogExceptionType.HANDLED, null, null, null, null, 848);
    }

    public void logException(@NotNull Throwable throwable, @NotNull Severity severity, Map<String, ? extends Object> properties, String message) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(severity, "severity");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(severity, "severity");
        iVar.f83155f.b(throwable, severity, properties, message);
    }

    public boolean recordCompletedSpan(@NotNull String name, long startTimeMs, long endTimeMs, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        n nVar = iVar.f83162m;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        return nVar.a(name, startTimeMs, endTimeMs, errorCode, null, null, null);
    }

    public boolean recordCompletedSpan(@NotNull String name, long startTimeMs, long endTimeMs, Map<String, String> attributes, List<oi2.c> events) {
        Intrinsics.checkNotNullParameter(name, "name");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        n nVar = iVar.f83162m;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        return nVar.a(name, startTimeMs, endTimeMs, null, null, attributes, events);
    }

    public void logCustomStacktrace(@NotNull StackTraceElement[] stacktraceElements, @NotNull Severity severity, Map<String, ? extends Object> properties, String message) {
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Intrinsics.checkNotNullParameter(severity, "severity");
        i iVar = this.impl;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Intrinsics.checkNotNullParameter(severity, "severity");
        g gVar = iVar.f83155f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(stacktraceElements, "stacktraceElements");
        Intrinsics.checkNotNullParameter(severity, "severity");
        g.d(gVar, severity, message == null ? "" : message, properties, stacktraceElements, null, LogExceptionType.HANDLED, null, message, null, null, 848);
    }
}
