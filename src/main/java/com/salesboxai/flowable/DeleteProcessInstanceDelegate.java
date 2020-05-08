package com.salesboxai.flowable;


import org.flowable.engine.RuntimeService;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.flowable.engine.impl.context.Context;

public class DeleteProcessInstanceDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {

        if(execution.hasVariable("delete_reason")) {
            final RuntimeService runtimeService = Context.getProcessEngineConfiguration().getRuntimeService();
            runtimeService.deleteProcessInstance(execution.getProcessInstanceId(), execution.getVariable("delete_reason").toString());
        }
    }
}
