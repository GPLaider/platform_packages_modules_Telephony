/*
 * Copyright (C) 2026 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.internal.telephony.metrics;

/** @hide */
public final class TelephonyMetrics {
    private static final TelephonyMetrics INSTANCE = new TelephonyMetrics();

    private TelephonyMetrics() {}

    public static TelephonyMetrics getInstance() {
        return INSTANCE;
    }

    public void writeOnRilSolicitedResponse(
            int phoneId, int serial, int error, int request, Object response) {}

    public void writeOnRilTimeoutResponse(int phoneId, int serial, int request) {}

    public void writeRilAnswer(int phoneId, int serial) {}

    public void writeRilSendSms(
            int phoneId, int serial, int tech, int format, long messageId) {}
}
