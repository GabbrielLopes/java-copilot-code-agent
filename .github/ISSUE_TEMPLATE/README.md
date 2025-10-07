# 📝 Templates de Issues - Guia para Professores

Bem-vindo ao sistema de templates de issues! Este guia ajudará você a solicitar mudanças e melhorias no sistema de gestão escolar de forma fácil e estruturada.

## 🎯 Por que usar templates?

Os templates de issue garantem que:
- ✅ Todas as informações necessárias sejam fornecidas
- ✅ O agente de codificação Copilot possa ser facilmente designado
- ✅ Suas solicitações sejam processadas rapidamente
- ✅ Não haja necessidade de explicações adicionais

## 📋 Templates Disponíveis

### 1. 🎓 Nova Atividade Extracurricular
**Quando usar:** Para criar uma nova atividade no sistema

**O que você precisa fornecer:**
- Nome da atividade
- Descrição detalhada
- Tipo/categoria (Esportes, Artes, Acadêmico, Comunidade, Tecnologia)
- Dias da semana
- Horários (início e término)
- Capacidade máxima de estudantes

**Arquivo:** `01-new-activity.yml`

---

### 2. ✏️ Modificar Atividade Existente
**Quando usar:** Para alterar informações de uma atividade já existente

**O que você pode modificar:**
- Nome da atividade
- Descrição
- Tipo/categoria
- Horários e dias
- Capacidade máxima

**Arquivo:** `02-modify-activity.yml`

---

### 3. 🐛 Reportar Problema
**Quando usar:** Quando algo não está funcionando corretamente

**O que você precisa fornecer:**
- Área do sistema afetada
- Descrição do problema
- Comportamento esperado
- Passos para reproduzir
- Mensagens de erro (se houver)

**Arquivo:** `03-bug-report.yml`

---

### 4. 👥 Gerenciar Inscrições de Estudantes
**Quando usar:** Para adicionar ou remover estudantes em lote

**O que você pode fazer:**
- Adicionar múltiplos estudantes a uma atividade
- Remover múltiplos estudantes de uma atividade
- Limpar todas as inscrições de uma atividade

**Arquivo:** `04-manage-registrations.yml`

---

### 5. 👨‍🏫 Gerenciar Professores
**Quando usar:** Para gerenciar contas de professores

**O que você pode fazer:**
- Adicionar novo professor
- Modificar informações de professor
- Remover professor
- Redefinir senha

**Arquivo:** `05-manage-teachers.yml`

---

### 6. 💡 Melhorias e Novas Funcionalidades
**Quando usar:** Para sugerir melhorias ou novas funcionalidades

**O que você precisa fornecer:**
- Área do sistema que seria afetada
- Problema ou necessidade
- Solução proposta
- Critérios de aceitação
- Prioridade

**Arquivo:** `06-feature-request.yml`

---

## 🚀 Como Usar os Templates

### Passo 1: Criar uma Nova Issue
1. Vá para a aba **Issues** do repositório
2. Clique em **New Issue**
3. Você verá a lista de templates disponíveis

### Passo 2: Escolher o Template Apropriado
- Selecione o template que melhor se adequa à sua necessidade
- Clique em **Get Started**

### Passo 3: Preencher o Formulário
- Preencha todos os campos obrigatórios (marcados com *)
- Forneça o máximo de detalhes possível
- Use exemplos quando disponíveis

### Passo 4: Revisar e Submeter
- Revise todas as informações
- Clique em **Submit new issue**
- O agente Copilot será automaticamente designado

### Passo 5: Acompanhar o Progresso
- Você receberá notificações sobre o andamento
- O agente comentará na issue com atualizações
- Você pode adicionar comentários se necessário

## ✨ Dicas para Issues de Qualidade

### ✅ Boas Práticas
- **Seja específico:** Forneça detalhes exatos, não generalizações
- **Use exemplos:** Dê exemplos concretos quando possível
- **Seja claro:** Use linguagem simples e direta
- **Verifique duas vezes:** Confirme que todas as informações estão corretas

### ❌ Evite
- Informações vagas ou incompletas
- Múltiplas solicitações em uma única issue
- Assumir que o contexto é óbvio
- Pular campos obrigatórios

## 📊 O que Acontece Depois?

1. **Designação Automática:** O agente Copilot é automaticamente atribuído
2. **Análise:** O agente analisa sua solicitação e valida as informações
3. **Implementação:** O código é escrito seguindo as melhores práticas
4. **Testes:** Testes automatizados garantem que tudo funciona
5. **Revisão:** Você pode revisar as mudanças antes de serem aplicadas
6. **Deploy:** As mudanças são aplicadas ao sistema

## 🔍 Estrutura de uma Issue Bem Definida

Cada template foi criado para incluir:

### 1. Descrição Clara do Problema
- O que precisa ser feito?
- Por que é necessário?

### 2. Critérios de Aceitação
- Como saberemos que está completo?
- O que deve funcionar?

### 3. Dicas Técnicas
- Sugestões de implementação
- Arquivos relevantes
- Padrões a seguir

### 4. Contexto Adicional
- Limitações conhecidas
- Informações relacionadas
- Referências úteis

## 📚 Recursos Adicionais

- **Documentação do Sistema:** [docs/README.md](../../docs/README.md)
- **Guia de Arquitetura:** Ver seção "Arquitetura" na documentação
- **Exemplos de Issues:** Procure por issues fechadas para ver exemplos

## ❓ Perguntas Frequentes

**P: Posso usar múltiplos templates para uma solicitação complexa?**  
R: Não, crie issues separadas para cada tipo de solicitação. Isso facilita o gerenciamento e implementação.

**P: O que acontece se eu esquecer alguma informação?**  
R: O agente solicitará as informações faltantes nos comentários da issue.

**P: Quanto tempo leva para processar uma issue?**  
R: Depende da complexidade, mas issues simples são geralmente processadas em minutos.

**P: Posso modificar a issue depois de criada?**  
R: Sim, você pode editar a descrição ou adicionar comentários com informações adicionais.

**P: Como sei que minha issue foi processada com sucesso?**  
R: A issue será fechada automaticamente quando o trabalho estiver completo, e você receberá uma notificação.

## 🆘 Precisa de Ajuda?

Se você tiver dúvidas ou problemas:
1. Consulte a [documentação completa](../../docs/README.md)
2. Procure por issues similares já resolvidas
3. Crie uma issue usando o template "💡 Melhorias e Novas Funcionalidades"

---

**Última atualização:** Outubro 2024  
**Mantido por:** Equipe de Desenvolvimento Mergington High School
